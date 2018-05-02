/*
 Navicat Premium Data Transfer

 Source Server         : 本地
 Source Server Type    : MySQL
 Source Server Version : 50722
 Source Host           : localhost
 Source Database       : ikedb

 Target Server Type    : MySQL
 Target Server Version : 50722
 File Encoding         : utf-8

 Date: 05/02/2018 20:36:34 PM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `ike_map_icon`
-- ----------------------------
DROP TABLE IF EXISTS `ike_map_icon`;
CREATE TABLE `ike_map_icon` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `ICON_NAME` varchar(100) NOT NULL COMMENT '标物名称',
  `REGION_ID` int(20) DEFAULT NULL COMMENT 'MAP_REGION.ID',
  `POINT_ID` int(20) DEFAULT NULL COMMENT 'POINT_ID.ID',
  `ICON_ST` varchar(10) NOT NULL COMMENT '标物类型Code 候选项： 学校 商场 医院 产业园 重点企业 物业 交通站点',
  `REAL_ESTATE_ST` varchar(10) DEFAULT NULL COMMENT '物业类型Code 候选项： 住宅、商业、办公、公寓',
  `APARTMENT_ST` varchar(10) DEFAULT NULL COMMENT '公寓类型Code 候选项： 普通住宅，洋房，别墅',
  `IS_ESTATE` int(2) DEFAULT '0' COMMENT '是否土地 0 否 1 是',
  `CREATE_DATE` date DEFAULT NULL COMMENT 'yyyy-MM-dd 成立时间 手填',
  `SYS_CREATE_DATE` date NOT NULL COMMENT '系统创建时间',
  `VERSION` int(6) DEFAULT '0' COMMENT '记录的版本 乐观锁',
  `DISABLED` int(2) DEFAULT '0' COMMENT '1 已逻辑删除 0 启用中',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='地图标物表-学校 商场等等';

-- ----------------------------
--  Records of `ike_map_icon`
-- ----------------------------
BEGIN;
INSERT INTO `ike_map_icon` VALUES ('1', '名称2', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('2', '名称2', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('3', '名称3', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('4', '名称4', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('5', '名称5', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('6', '名称6', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('7', '名称7', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('8', '名称8', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('9', '名称9', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('10', '名称10', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('11', '名称11', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('12', '名称12', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('13', '名称13', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0'), ('14', '名称14', null, null, 'SCHOOL', 'BUSINESS', 'HOUSES', '0', '2018-03-30', '2018-03-30', '1', '0');
COMMIT;

-- ----------------------------
--  Table structure for `ike_map_points`
-- ----------------------------
DROP TABLE IF EXISTS `ike_map_points`;
CREATE TABLE `ike_map_points` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `LNG` decimal(9,6) NOT NULL COMMENT '经度',
  `LAT` decimal(9,6) NOT NULL COMMENT '纬度',
  `TYPE_ST` varchar(10) NOT NULL COMMENT '地图点坐标类型Code 候选项： 区域 坐标物',
  `MAP_ORDER` int(4) DEFAULT '0' COMMENT '顺序',
  `SYS_CREATE_DATE` date NOT NULL COMMENT '系统创建时间',
  `VERSION` int(6) DEFAULT '0' COMMENT '记录的版本 乐观锁',
  `DISABLED` int(2) DEFAULT '0' COMMENT '1 已逻辑删除 0 启用中',
  `REGION_ID` int(9) DEFAULT NULL,
  `PROJECT_ID` int(9) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8 COMMENT='地图点';

-- ----------------------------
--  Records of `ike_map_points`
-- ----------------------------
BEGIN;
INSERT INTO `ike_map_points` VALUES ('1', '120.355368', '31.603480', 'REGION', '1', '2018-01-16', '0', '0', '4', null), ('2', '120.359249', '31.601204', 'REGION', '2', '2018-01-16', '0', '0', '4', null), ('3', '120.359464', '31.597391', 'REGION', '3', '2018-01-16', '0', '0', '4', null), ('4', '120.355584', '31.597944', 'REGION', '4', '2018-01-16', '0', '0', '4', null), ('5', '120.353069', '31.600651', 'REGION', '5', '2018-01-16', '0', '0', '4', null), ('6', '120.306105', '31.616089', 'REGION', '1', '2018-01-28', '0', '0', '5', null), ('7', '120.314082', '31.611169', 'REGION', '2', '2018-01-28', '0', '0', '5', null), ('8', '120.316885', '31.617934', 'REGION', '3', '2018-01-28', '0', '0', '5', null), ('9', '120.308908', '31.621501', 'REGION', '4', '2018-01-28', '0', '0', '5', null), ('10', '120.316166', '31.616212', 'REGION', '1', '2018-03-11', '0', '0', '6', null), ('11', '120.322275', '31.616827', 'REGION', '2', '2018-03-11', '0', '0', '6', null), ('12', '120.320909', '31.612891', 'REGION', '3', '2018-03-11', '0', '0', '6', null), ('13', '120.315735', '31.612768', 'REGION', '4', '2018-03-11', '0', '0', '6', null), ('14', '120.317172', '31.627835', 'REGION', '1', '2018-03-14', '0', '0', '7', null), ('15', '120.320765', '31.626236', 'REGION', '2', '2018-03-14', '0', '0', '7', null), ('16', '120.319400', '31.619779', 'REGION', '3', '2018-03-14', '0', '0', '7', null), ('17', '120.312932', '31.618118', 'REGION', '4', '2018-03-14', '0', '0', '7', null), ('18', '120.307686', '31.620086', 'REGION', '5', '2018-03-14', '0', '0', '7', null), ('19', '120.308117', '31.623100', 'REGION', '6', '2018-03-14', '0', '0', '7', null), ('20', '120.305386', '31.628019', 'REGION', '7', '2018-03-14', '0', '0', '7', null), ('21', '120.305674', '31.628573', 'REGION', '8', '2018-03-14', '0', '0', '7', null), ('22', '120.313866', '31.627527', 'REGION', '9', '2018-03-14', '0', '0', '7', null), ('23', '120.313866', '31.621009', 'REGION', '10', '2018-03-14', '0', '0', '7', null), ('24', '120.319472', '31.623038', 'REGION', '11', '2018-03-14', '0', '0', '7', null), ('25', '120.327161', '31.625190', 'REGION', '12', '2018-03-14', '0', '0', '7', null), ('26', '120.328527', '31.626974', 'REGION', '13', '2018-03-14', '0', '0', '7', null), ('27', '120.334563', '31.621624', 'REGION', '14', '2018-03-14', '0', '0', '7', null), ('28', '120.324574', '31.616827', 'REGION', '15', '2018-03-14', '0', '0', '7', null), ('29', '120.319831', '31.616458', 'REGION', '16', '2018-03-14', '0', '0', '7', null), ('30', '120.318106', '31.616458', 'REGION', '17', '2018-03-14', '0', '0', '7', null), ('31', '120.316741', '31.616704', 'REGION', '18', '2018-03-14', '0', '0', '7', null), ('32', '120.315160', '31.616642', 'REGION', '19', '2018-03-14', '0', '0', '7', null), ('33', '120.306393', '31.616335', 'REGION', '20', '2018-03-14', '0', '0', '7', null), ('34', '120.302871', '31.615904', 'REGION', '21', '2018-03-14', '0', '0', '7', null), ('35', '120.299134', '31.617872', 'REGION', '22', '2018-03-14', '0', '0', '7', null), ('36', '120.296475', '31.624944', 'REGION', '23', '2018-03-14', '0', '0', '7', null), ('37', '120.296475', '31.626789', 'REGION', '24', '2018-03-14', '0', '0', '7', null), ('38', '120.303159', '31.626912', 'REGION', '25', '2018-03-14', '0', '0', '7', null), ('39', '120.351488', '31.602004', 'REGION', '1', '2018-03-14', '0', '0', '8', null), ('40', '120.343007', '31.595361', 'REGION', '2', '2018-03-14', '0', '0', '8', null), ('41', '120.356949', '31.593269', 'REGION', '3', '2018-03-14', '0', '0', '8', null), ('42', '120.358674', '31.600835', 'REGION', '4', '2018-03-14', '0', '0', '8', null), ('43', '120.344876', '31.603665', 'REGION', '1', '2018-03-14', '0', '0', '9', null), ('44', '120.342648', '31.596099', 'REGION', '2', '2018-03-14', '0', '0', '9', null), ('45', '120.359177', '31.595976', 'REGION', '3', '2018-03-14', '0', '0', '9', null), ('46', '120.357883', '31.602312', 'REGION', '4', '2018-03-14', '0', '0', '9', null), ('47', '120.352062', '31.605695', 'REGION', '1', '2018-03-14', '0', '0', '10', null), ('48', '120.349260', '31.602742', 'REGION', '2', '2018-03-14', '0', '0', '10', null), ('49', '120.358961', '31.601942', 'REGION', '3', '2018-03-14', '0', '0', '10', null), ('50', '120.357596', '31.606617', 'REGION', '4', '2018-03-14', '0', '0', '10', null), ('51', '120.347607', '31.601327', 'REGION', '1', '2018-03-14', '0', '0', '11', null), ('52', '120.355799', '31.604341', 'REGION', '2', '2018-03-14', '0', '0', '11', null), ('53', '120.352494', '31.598006', 'REGION', '3', '2018-03-14', '0', '0', '11', null), ('54', '120.360183', '31.600466', 'REGION', '4', '2018-03-14', '0', '0', '11', null), ('55', '120.298164', '31.625498', 'REGION', '1', '2018-03-27', '0', '0', '13', null), ('56', '120.298955', '31.620209', 'REGION', '2', '2018-03-27', '0', '0', '13', null), ('57', '120.306069', '31.625621', 'REGION', '3', '2018-03-27', '0', '0', '13', null), ('58', '120.307075', '31.621132', 'REGION', '4', '2018-03-27', '0', '0', '13', null), ('59', '120.291337', '31.626359', 'REGION', '1', '2018-03-28', '0', '0', '14', null), ('60', '120.287025', '31.623346', 'REGION', '2', '2018-03-28', '0', '0', '14', null), ('61', '120.293493', '31.621747', 'REGION', '3', '2018-03-28', '0', '0', '14', null), ('62', '120.296799', '31.626605', 'REGION', '4', '2018-03-28', '0', '0', '14', null), ('63', '120.289181', '31.623899', 'REGION', '1', '2018-03-28', '0', '0', '15', null), ('64', '120.286953', '31.617811', 'REGION', '2', '2018-03-28', '0', '0', '15', null), ('65', '120.297517', '31.622054', 'REGION', '3', '2018-03-28', '0', '0', '15', null), ('66', '120.296080', '31.618549', 'REGION', '4', '2018-03-28', '0', '0', '15', null), ('67', '120.287816', '31.625867', 'REGION', '1', '2018-03-28', '0', '0', '16', null), ('68', '120.286594', '31.621070', 'REGION', '2', '2018-03-28', '0', '0', '16', null), ('69', '120.292127', '31.618856', 'REGION', '3', '2018-03-28', '0', '0', '16', null), ('70', '120.294140', '31.625006', 'REGION', '4', '2018-03-28', '0', '0', '16', null), ('71', '120.284079', '31.626543', 'REGION', '1', '2018-03-29', '0', '0', '17', null), ('72', '120.285157', '31.621562', 'REGION', '2', '2018-03-29', '0', '0', '17', null), ('73', '120.291553', '31.626605', 'REGION', '3', '2018-03-29', '0', '0', '17', null), ('74', '120.292056', '31.622485', 'REGION', '4', '2018-03-29', '0', '0', '17', null);
COMMIT;

-- ----------------------------
--  Table structure for `ike_map_project`
-- ----------------------------
DROP TABLE IF EXISTS `ike_map_project`;
CREATE TABLE `ike_map_project` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `PROJECT_NAME` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '项目名称',
  `AREA` varchar(255) COLLATE utf8_bin DEFAULT '' COMMENT '区',
  `REGION_ID` int(9) NOT NULL COMMENT 'MAP_REGION.ID',
  `REGION_NAME` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '区域名 冗余字段',
  `AREA_AMOUNT` int(9) DEFAULT NULL COMMENT '占地面积',
  `PRICE` int(9) DEFAULT NULL,
  `VERSION` int(9) DEFAULT NULL,
  `CREATE_DATE` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `DISABLED` int(11) DEFAULT NULL COMMENT '1 已删除 ',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Records of `ike_map_project`
-- ----------------------------
BEGIN;
INSERT INTO `ike_map_project` VALUES ('1', 'ad', '123', '8', '阿萨德', '123', '12', '0', '2018-03-29 14:52:19', '0'), ('2', 'llll123123', '1', '10', '坎坎坷坷', '1', '1', '0', '2018-03-29 15:18:16', '0');
COMMIT;

-- ----------------------------
--  Table structure for `ike_map_region`
-- ----------------------------
DROP TABLE IF EXISTS `ike_map_region`;
CREATE TABLE `ike_map_region` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `REGION_NAME` varchar(50) NOT NULL COMMENT '区域名称',
  `REGION_CODE` varchar(30) NOT NULL COMMENT '区域码 WX0001',
  `LEVEL_ST` varchar(10) NOT NULL COMMENT '成熟度Code 候选项：起步 成长 成熟',
  `CREATE_DATE` date DEFAULT NULL COMMENT 'yyyy-MM-dd 成立时间 手填',
  `PRICE` bigint(9) DEFAULT NULL COMMENT '区域均价 单位：元',
  `TOP_PRICE` bigint(9) DEFAULT NULL COMMENT ' 最高价 单位：元',
  `POPULATION_ST` varchar(10) NOT NULL COMMENT '人口密度Code 候选项：待定',
  `SYS_CREATE_DATE` date NOT NULL COMMENT '系统创建时间',
  `VERSION` int(6) DEFAULT '0' COMMENT '记录的版本 乐观锁',
  `DISABLED` int(2) DEFAULT '0' COMMENT '1 已逻辑删除 0 启用中',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COMMENT='区域表：地图上显示的区块';

-- ----------------------------
--  Records of `ike_map_region`
-- ----------------------------
BEGIN;
INSERT INTO `ike_map_region` VALUES ('1', '雨花区', 'WX001', 'A', null, '10000', '20000', 'aaaa', '2018-01-08', '0', '0'), ('2', '天心区', 'WX002', 'S', null, '12000', '18000', 'S', '2018-01-10', '0', '0'), ('3', '梧桐区', 'WX003', 'B', null, '15000', '16000', 'A', '2018-01-10', '0', '0'), ('4', '岳麓区', 'WX004', '起步', '2018-01-16', '19000', '18000', 'XX', '2018-01-16', '0', '0'), ('5', '32', 'WX18012816591511330', '成长', '2018-01-28', '21312', '323', 'XX', '2018-01-28', '0', '0'), ('6', '1221', 'WX18031114192215516', '起步', '2018-03-11', '21', null, 'XX', '2018-03-11', '0', '0'), ('7', '4654', 'WX18031413585178179', '成长', '2018-03-14', '11', '100', 'XX', '2018-03-14', '0', '0'), ('8', '阿萨德', 'WX1', '起步', '2018-03-14', '123', '123', 'XX', '2018-03-14', '0', '0'), ('9', 'QWERTY', 'RC002', '起步', '2018-03-14', '123', '123', 'XX', '2018-03-14', '0', '0'), ('10', '坎坎坷坷', 'RC003', '起步', '2018-03-14', '123', '123', 'XX', '2018-03-14', '0', '0'), ('11', '柔柔弱弱若若若', 'RC004', '起步', '2018-03-14', '123', '123', 'XX', '2018-03-14', '0', '0'), ('12', 'dfg', 'RC005', '起步', '2018-03-14', '123', '3', 'XX', '2018-03-14', '0', '0'), ('13', '测试一下吧', 'RC006', '成长', '2018-03-27', '1', '1', 'XX', '2018-03-27', '0', '0'), ('14', '123阿达', 'RC007', '起步', '2018-03-28', '123', '123', 'XX', '2018-03-28', '0', '0'), ('15', '阿萨德123123', 'RC008', '起步', '2018-03-28', '1', '1', 'XX', '2018-03-28', '0', '0'), ('16', '111111', 'RC009', '成长', '2018-03-28', '1', '1', 'XX', '2018-03-28', '0', '0'), ('17', '数据字典', 'RC010', 'MATURE', '2018-03-29', '1', '1', 'XX', '2018-03-29', '0', '0');
COMMIT;

-- ----------------------------
--  Table structure for `ike_map_region_point_rl`
-- ----------------------------
DROP TABLE IF EXISTS `ike_map_region_point_rl`;
CREATE TABLE `ike_map_region_point_rl` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `REGION_ID` int(9) NOT NULL COMMENT 'MAP_REGION.ID',
  `POINT_ID` int(9) NOT NULL COMMENT 'MAP_POINTS.ID',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8 COMMENT='区域-坐标关联表';

-- ----------------------------
--  Records of `ike_map_region_point_rl`
-- ----------------------------
BEGIN;
INSERT INTO `ike_map_region_point_rl` VALUES ('1', '4', '1'), ('2', '4', '2'), ('3', '4', '3'), ('4', '4', '4'), ('5', '4', '5'), ('6', '5', '6'), ('7', '5', '7'), ('8', '5', '8'), ('9', '5', '9'), ('10', '6', '10'), ('11', '6', '11'), ('12', '6', '12'), ('13', '6', '13'), ('14', '7', '14'), ('15', '7', '15'), ('16', '7', '16'), ('17', '7', '17'), ('18', '7', '18'), ('19', '7', '19'), ('20', '7', '20'), ('21', '7', '21'), ('22', '7', '22'), ('23', '7', '23'), ('24', '7', '24'), ('25', '7', '25'), ('26', '7', '26'), ('27', '7', '27'), ('28', '7', '28'), ('29', '7', '29'), ('30', '7', '30'), ('31', '7', '31'), ('32', '7', '32'), ('33', '7', '33'), ('34', '7', '34'), ('35', '7', '35'), ('36', '7', '36'), ('37', '7', '37'), ('38', '7', '38'), ('39', '8', '39'), ('40', '8', '40'), ('41', '8', '41'), ('42', '8', '42'), ('43', '9', '43'), ('44', '9', '44'), ('45', '9', '45'), ('46', '9', '46'), ('47', '10', '47'), ('48', '10', '48'), ('49', '10', '49'), ('50', '10', '50'), ('51', '11', '51'), ('52', '11', '52'), ('53', '11', '53'), ('54', '11', '54'), ('55', '13', '55'), ('56', '13', '56'), ('57', '13', '57'), ('58', '13', '58'), ('59', '14', '59'), ('60', '14', '60'), ('61', '14', '61'), ('62', '14', '62'), ('63', '15', '63'), ('64', '15', '64'), ('65', '15', '65'), ('66', '15', '66'), ('67', '16', '67'), ('68', '16', '68'), ('69', '16', '69'), ('70', '16', '70'), ('71', '17', '71'), ('72', '17', '72'), ('73', '17', '73'), ('74', '17', '74');
COMMIT;

-- ----------------------------
--  Table structure for `sys_dict`
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict` (
  `ID` int(9) NOT NULL AUTO_INCREMENT,
  `CODE` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT 'CODE',
  `VALUE` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '值',
  `PARENT` int(9) DEFAULT '0' COMMENT '父级ID',
  `COMMENTS` varchar(300) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `DISABLED` int(11) DEFAULT NULL COMMENT '1 已删除 ',
  `CREATE_DATE` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `VERSION` int(9) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UK_DCT_CODE` (`CODE`,`PARENT`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8 COMMENT='数据字典';

-- ----------------------------
--  Records of `sys_dict`
-- ----------------------------
BEGIN;
INSERT INTO `sys_dict` VALUES ('4', 'ICON_BW_TYPE', '标物类型', null, '标物类型', '0', '2018-03-29 10:21:43', '1'), ('5', 'SCHOOL', '学校', '4', '学校', '0', '2018-03-29 10:21:43', '1'), ('6', 'MALL', '商场', '4', '商场', '0', '2018-03-29 10:21:43', '1'), ('7', 'HOSPITAL', '医院', '4', '医院', '0', '2018-03-29 10:21:43', '1'), ('8', 'INDUSTRIAL_PARK', '产业园', '4', '产业园', '0', '2018-03-29 10:21:43', '1'), ('9', 'COMPANY', '企业', '4', '企业', '0', '2018-03-29 10:21:43', '1'), ('10', 'PROPERTY', '物业', '4', '物业', '0', '2018-03-29 10:21:43', '1'), ('11', 'TRAFFIC_STATION', '交通站点', '4', '交通站点', '0', '2018-03-29 10:21:43', '1'), ('12', 'ICON_WY_TYPE', '物业类型', null, '物业类型', '0', '2018-03-29 10:21:43', '1'), ('13', 'RESIDENTIAL', '住宅', '12', '住宅', '0', '2018-03-29 10:21:43', '1'), ('14', 'BUSINESS', '商业', '12', '商业', '0', '2018-03-29 10:21:43', '1'), ('15', 'OFFICE', '办公', '12', '办公', '0', '2018-03-29 10:21:43', '1'), ('16', 'APARTMENT', '公寓', '12', '公寓', '0', '2018-03-29 10:21:43', '1'), ('17', 'ICON_GY_TYPE', '公寓类型', null, '公寓类型', '0', '2018-03-29 10:21:43', '1'), ('18', 'AVERAGE_HOUSE', '普通住宅', '17', '普通住宅', '0', '2018-03-29 10:21:43', '1'), ('19', 'HOUSES', '洋房', '17', '洋房', '0', '2018-03-29 10:21:43', '1'), ('20', 'VILLA', '别墅', '17', '别墅', '0', '2018-03-29 10:21:43', '1'), ('21', 'LEVEL_TYPE', '成熟度', null, '成熟度', '0', '2018-03-29 10:21:43', '1'), ('22', 'START', '起步', '21', '起步', '0', '2018-03-29 10:21:43', '1'), ('23', 'GROWTH', '成长', '21', '成长', '0', '2018-03-29 10:21:43', '1'), ('24', 'MATURE', '成熟', '21', '成熟', '0', '2018-03-29 10:21:43', '1'), ('25', 'POP_TYPE', '人口密度', null, '人口密度', '0', '2018-03-29 10:24:51', '1'), ('26', 'PROS', '繁华', '25', '繁华', '0', '2018-03-29 10:24:51', '1'), ('27', 'GENERAL', '一般', '25', '一般', '0', '2018-03-29 10:24:51', '1');
COMMIT;

-- ----------------------------
--  Table structure for `sys_sequence`
-- ----------------------------
DROP TABLE IF EXISTS `sys_sequence`;
CREATE TABLE `sys_sequence` (
  `table_name` varchar(50) NOT NULL COMMENT '表名',
  `start_date` date NOT NULL COMMENT '日期',
  `next_val` int(11) NOT NULL DEFAULT '1',
  `increment` int(11) NOT NULL DEFAULT '1',
  `update_time` datetime NOT NULL,
  PRIMARY KEY (`table_name`,`start_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='序列';

-- ----------------------------
--  Records of `sys_sequence`
-- ----------------------------
BEGIN;
INSERT INTO `sys_sequence` VALUES ('ike_map_region', '2018-03-14', '10', '1', '2018-03-29 10:31:47');
COMMIT;

-- ----------------------------
--  Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `t_user`
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES ('1', 'Tom'), ('2', 'Tom');
COMMIT;

-- ----------------------------
--  Table structure for `user_role`
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `role_name` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
--  Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(9) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_bin NOT NULL,
  `password` varchar(50) COLLATE utf8_bin NOT NULL,
  `mail` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

SET FOREIGN_KEY_CHECKS = 1;
