//index.js
var network = require("../../utils/http.js")
//获取应用实例
const app = getApp()

Page({
  data: {
    motto: '你好',
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    name: "wj",
    isChange: false,
    user: {}
  },
  // 分享
  onShareAppMessage: function () {
    return {
      title: '我在未来等你',
      path: '/page/user?id=123'
    }
  },
  onLoad: function () {
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse) {
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
        this.setData({
          userInfo: res.userInfo,
          hasUserInfo: true
        })
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          this.setData({
            userInfo: res.userInfo,
            hasUserInfo: true
          })
        }
      })
    }
  },
  getUserInfo: function (e) {
    var that = this;
    var parms=null;
    if (e.detail.userInfo!=undefined){
      parms =
        {
          uName: e.detail.userInfo.nickName,
          uIconUrl: e.detail.userInfo.avatarUrl
        };
    }
    app.globalData.userInfo = e.detail.userInfo
    this.setData({
      userInfo: e.detail.userInfo,
      hasUserInfo: true
    })
    network.HttpRequst(
      true,
      "/addUser",
      parms, 
      "GET",
      null,
      null,
      function doSuccess(res) {
        that.setData({
          user: res.data
        })
      }, function doSuccess(res) {
        console.log("失败");
      })
  },
  changeStr: function () {
    if (!this.data.isChange) {
      this.data.motto = "hello world",
        this.data.isChange = true
    } else {
      this.data.motto = "你好",
        this.data.isChange = false
    }
    this.setData({
      motto: this.data.motto
    })
  },
  changeName: function () {
    if (!this.data.isChange) {
      this.data.name = "wj",
        this.data.isChange = true
    } else {
      this.data.name = "王静",
        this.data.isChange = false
    }
    this.setData({
      name: this.data.name
    })
  }

})


