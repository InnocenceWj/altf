/*
Navicat MySQL Data Transfer

Source Server         : wj
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : springboot_altf

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-07-09 18:06:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for letter
-- ----------------------------
DROP TABLE IF EXISTS `letter`;
CREATE TABLE `letter` (
  `l_id` bigint(20) NOT NULL,
  `u_id` bigint(20) DEFAULT NULL,
  `l_content` varchar(255) DEFAULT NULL,
  `l_last_time` int(11) DEFAULT NULL,
  `l_img` varchar(255) DEFAULT NULL,
  `l_mp3` varchar(255) DEFAULT NULL,
  `l_voice` varchar(255) DEFAULT NULL,
  `l_video` varchar(255) DEFAULT NULL,
  `l_receive_email` varchar(32) DEFAULT NULL,
  `l_is_public` tinyint(4) DEFAULT NULL,
  `l_create_time` datetime DEFAULT NULL,
  `l_is_valid` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of letter
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` bigint(19) NOT NULL,
  `u_name` varchar(32) DEFAULT NULL,
  `u_pwd` varchar(32) DEFAULT NULL,
  `u_register_time` datetime DEFAULT NULL,
  `u_is_valid` tinyint(4) DEFAULT NULL,
  `u_icon_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('201034313905471488', '', null, '2018-07-09 17:58:35', '1', 'https://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83eoClDTZsr5Sd5icWLnMozicX8vhhThPk6RNrcfUKsZId7njM7AlwBG5IV4lhniaP5PPgQ6PYnlp8CZhQ/132');
