var baseUrl = "http://localhost:8080"

function HttpRequst(loading, url, params, method, sessionChoose, sessionId, doSuccess, doFail) {
  if (loading == true) {
    wx.showToast({
      title: '数据加载中',
      icon: 'loading'
    })
  }
  var paramSession = [{},
  { 'content-type': 'application/json', 'Cookie': 'JSESSIONID=' + sessionId },
  { 'content-type': 'application/json' },
  { 'content-type': 'application/x-www-form-urlencoded', 'Cookie': 'JSESSIONID=' + sessionId },
  { 'content-type': 'application/x-www-form-urlencoded' }]
  wx.request({
    url: baseUrl + url,
    data: params,
    dataType: "json",
    header: paramSession[sessionChoose],
    method: method,
    success: function (res) {
      if (loading == true) {
        wx.hideToast();//隐藏提示框
      }
      if (typeof doSuccess == "function") {
        doSuccess(res);
      }
    },
    fail: function () {
      if (typeof doFail == "function") {
        doFail();
      }
    },
    complete: function () {
      if (loading == true) {
        wx.hideToast();//隐藏提示框
      }
    }
  })
}

module.exports = {
  HttpRequst: HttpRequst
}