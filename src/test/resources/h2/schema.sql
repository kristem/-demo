SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `coz_id` int(11) NOT NULL,
  `coz_name` varchar(255) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '1', '舞蹈');
INSERT INTO `course` VALUES ('2', '2', '创作');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) NOT NULL,
  `stu_name` varchar(255) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '100', '孟美骑');
INSERT INTO `student` VALUES ('2', '101', '杨超月');
INSERT INTO `student` VALUES ('3', '102', '过瘾');

-- ----------------------------
-- Table structure for stu_coz
-- ----------------------------
DROP TABLE IF EXISTS `stu_coz`;
CREATE TABLE `stu_coz` (
  `scid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`scid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of stu_coz
-- ----------------------------
INSERT INTO `stu_coz` VALUES ('1', '100', '1');
INSERT INTO `stu_coz` VALUES ('2', '101', '1');
INSERT INTO `stu_coz` VALUES ('3', '102', '2');

-- ----------------------------
-- Table structure for tch_coz
-- ----------------------------
DROP TABLE IF EXISTS `tch_coz`;
CREATE TABLE `tch_coz` (
  `tcid` int(11) NOT NULL AUTO_INCREMENT,
  `tid` int(11) NOT NULL,
  `cid` int(11) NOT NULL,
  PRIMARY KEY (`tcid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tch_coz
-- ----------------------------
INSERT INTO `tch_coz` VALUES ('1', '11', '1');
INSERT INTO `tch_coz` VALUES ('2', '12', '2');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `tch_id` int(11) NOT NULL,
  `tch_name` varchar(255) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '11', '王一伯');
INSERT INTO `teacher` VALUES ('2', '12', '胡彦彬');
