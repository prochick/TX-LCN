/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50557
Source Host           : localhost:3306
Source Database       : goods

Target Server Type    : MYSQL
Target Server Version : 50557
File Encoding         : 65001

Date: 2021-03-11 12:25:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `g_order`
-- ----------------------------
DROP TABLE IF EXISTS `g_order`;
CREATE TABLE `g_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` int(11) DEFAULT NULL,
  `price` double(5,2) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_order
-- ----------------------------

-- ----------------------------
-- Table structure for `g_stock`
-- ----------------------------
DROP TABLE IF EXISTS `g_stock`;
CREATE TABLE `g_stock` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(30) DEFAULT NULL,
  `item_num` int(3) DEFAULT NULL,
  PRIMARY KEY (`item_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_stock
-- ----------------------------
INSERT INTO `g_stock` VALUES ('1', '商品1', '100');
