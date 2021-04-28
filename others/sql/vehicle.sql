/*
 Navicat MySQL Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : vehicle

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 28/04/2021 10:16:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for card_info
-- ----------------------------
DROP TABLE IF EXISTS `card_info`;
CREATE TABLE `card_info`  (
  `id` int(0) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for point_info
-- ----------------------------
DROP TABLE IF EXISTS `point_info`;
CREATE TABLE `point_info`  (
  `id` int(0) NOT NULL,
  `longitude` float NULL DEFAULT NULL COMMENT '经度',
  `latitude` float NULL DEFAULT NULL COMMENT '纬度',
  `arrive_point` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '地名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for road_info
-- ----------------------------
DROP TABLE IF EXISTS `road_info`;
CREATE TABLE `road_info`  (
  `id` int(0) NOT NULL,
  `road_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '路段名称',
  `start_point` int(0) NULL DEFAULT NULL COMMENT '路段起始点坐标id',
  `end_point` int(0) NULL DEFAULT NULL COMMENT '路段终点坐标id',
  `road_length` int(0) NULL DEFAULT NULL COMMENT '路段长度',
  `road_rank` int(0) NULL DEFAULT NULL COMMENT '路段级别',
  `road_condition` int(0) NULL DEFAULT NULL COMMENT '路段交通状况',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
