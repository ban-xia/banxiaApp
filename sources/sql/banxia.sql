-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: banxia
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `banxia_department`
--

DROP TABLE IF EXISTS `banxia_department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banxia_department` (
  `dep_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `dep_num` varchar(16) NOT NULL DEFAULT '' COMMENT '科室编号',
  `dep_name` varchar(64) NOT NULL DEFAULT '' COMMENT '科室名称',
  `dep_intro` varchar(255) DEFAULT '' COMMENT '科室介绍',
  `dep_extra` varchar(255) DEFAULT '' COMMENT '科室其他信息',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否被删除',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `created_by` varchar(16) DEFAULT '' COMMENT '创建者',
  `updated_by` varchar(16) DEFAULT '' COMMENT '修改者',
  PRIMARY KEY (`dep_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='科室表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banxia_department`
--

LOCK TABLES `banxia_department` WRITE;
/*!40000 ALTER TABLE `banxia_department` DISABLE KEYS */;
/*!40000 ALTER TABLE `banxia_department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banxia_doctor`
--

DROP TABLE IF EXISTS `banxia_doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banxia_doctor` (
  `doc_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `doc_num` varchar(16) NOT NULL DEFAULT '' COMMENT '医生编号',
  `doc_password` varchar(64) NOT NULL DEFAULT '' COMMENT '医生密码',
  `doc_name` varchar(64) DEFAULT '' COMMENT '医生名称',
  `doc_phone` char(11) NOT NULL DEFAULT '' COMMENT '医生电话',
  `doc_age` int(4) NOT NULL DEFAULT '0' COMMENT '医生年龄',
  `doc_country` varchar(64) DEFAULT '' COMMENT '医生国家',
  `doc_nation` varchar(64) DEFAULT '' COMMENT '医生民族',
  `doc_address` varchar(128) NOT NULL DEFAULT '0' COMMENT '医生户籍',
  `doc_dep_id` int(8) NOT NULL DEFAULT '0' COMMENT '医生从属科室',
  `doc_gender` tinyint(4) NOT NULL DEFAULT '0' COMMENT '医生性别 0女；1男',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否被删除',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `created_by` varchar(16) DEFAULT '' COMMENT '创建者',
  `updated_by` varchar(16) DEFAULT '' COMMENT '修改者',
  PRIMARY KEY (`doc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='医生表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banxia_doctor`
--

LOCK TABLES `banxia_doctor` WRITE;
/*!40000 ALTER TABLE `banxia_doctor` DISABLE KEYS */;
/*!40000 ALTER TABLE `banxia_doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banxia_duty`
--

DROP TABLE IF EXISTS `banxia_duty`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banxia_duty` (
  `duty_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `duty_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '值班当天日期',
  `duty_depart_id` int(8) NOT NULL DEFAULT '0' COMMENT '值班科室',
  `duty_period` tinyint(4) NOT NULL DEFAULT '0' COMMENT '值班时段 0上午1下午',
  `duty_doc_id` int(8) NOT NULL DEFAULT '0' COMMENT '值班医生id',
  `duty_on_duty` tinyint(4) NOT NULL DEFAULT '0' COMMENT '值班状态 0当值1不当值',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否被删除',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `created_by` varchar(16) DEFAULT '' COMMENT '创建者',
  `updated_by` varchar(16) DEFAULT '' COMMENT '修改者',
  PRIMARY KEY (`duty_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='值日表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banxia_duty`
--

LOCK TABLES `banxia_duty` WRITE;
/*!40000 ALTER TABLE `banxia_duty` DISABLE KEYS */;
/*!40000 ALTER TABLE `banxia_duty` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banxia_record`
--

DROP TABLE IF EXISTS `banxia_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banxia_record` (
  `rec_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `rec_dep_id` int(8) NOT NULL DEFAULT '0' COMMENT '病历科室id',
  `rec_doc_id` int(8) NOT NULL DEFAULT '0' COMMENT '病历医生id',
  `rec_user_id` int(8) NOT NULL DEFAULT '0' COMMENT '病历患者id',
  `rec_intro` varchar(64) NOT NULL DEFAULT '' COMMENT '病历详情',
  `rec_extra` varchar(64) NOT NULL DEFAULT '' COMMENT '病历补充',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否被删除',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `created_by` varchar(16) DEFAULT '' COMMENT '创建者',
  `updated_by` varchar(16) DEFAULT '' COMMENT '修改者',
  PRIMARY KEY (`rec_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='病历表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banxia_record`
--

LOCK TABLES `banxia_record` WRITE;
/*!40000 ALTER TABLE `banxia_record` DISABLE KEYS */;
/*!40000 ALTER TABLE `banxia_record` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banxia_treat`
--

DROP TABLE IF EXISTS `banxia_treat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banxia_treat` (
  `treat_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `treat_dep_id` int(8) NOT NULL DEFAULT '0' COMMENT '诊治科室id',
  `treat_doc_id` int(8) NOT NULL DEFAULT '0' COMMENT '诊治医生id',
  `treat_user_id` int(8) NOT NULL DEFAULT '0' COMMENT '诊治患者id',
  `treat_price` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '诊治价格',
  `treat_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '诊治状态',
  `treat_extra` varchar(64) NOT NULL DEFAULT '' COMMENT '诊治补充',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否被删除',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `created_by` varchar(16) DEFAULT '' COMMENT '创建者',
  `updated_by` varchar(16) DEFAULT '' COMMENT '修改者',
  PRIMARY KEY (`treat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='诊治表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banxia_treat`
--

LOCK TABLES `banxia_treat` WRITE;
/*!40000 ALTER TABLE `banxia_treat` DISABLE KEYS */;
/*!40000 ALTER TABLE `banxia_treat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banxia_user`
--

DROP TABLE IF EXISTS `banxia_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `banxia_user` (
  `user_id` int(8) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` varchar(16) NOT NULL DEFAULT '' COMMENT '用户名称',
  `user_pass` varchar(255) NOT NULL DEFAULT '' COMMENT '用户密码',
  `user_phone` char(11) NOT NULL DEFAULT '' COMMENT '用户电话',
  `user_image` varchar(255) NOT NULL DEFAULT '' COMMENT '用户头像地址',
  `user_gender` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户性别 0女1男',
  `user_age` int(8) NOT NULL DEFAULT '0' COMMENT '用户年纪',
  `user_birth` varchar(64) NOT NULL DEFAULT '' COMMENT '用户出生日期',
  `user_height` int(8) NOT NULL DEFAULT '0' COMMENT '用户身高',
  `user_weight` int(8) NOT NULL DEFAULT '0' COMMENT '用户体重',
  `user_smoke_hist` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户吸烟史 0无1有',
  `user_drink_hist` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户饮酒史 0无1有',
  `user_is_married` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户是否结婚 0无1有',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否被删除',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `created_by` varchar(16) DEFAULT '' COMMENT '创建者',
  `updated_by` varchar(16) DEFAULT '' COMMENT '修改者',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='患者表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banxia_user`
--

LOCK TABLES `banxia_user` WRITE;
/*!40000 ALTER TABLE `banxia_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `banxia_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-11 20:51:40
