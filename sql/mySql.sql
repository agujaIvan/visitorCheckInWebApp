-- MySQL dump 10.13  Distrib 5.7.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: visitorcheckinappdb
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `classtable`
--

DROP TABLE IF EXISTS `classtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classtable` (
  `idClassTable` int(11) NOT NULL AUTO_INCREMENT,
  `idUserTable` int(11) NOT NULL,
  `idStyleTable` int(11) NOT NULL,
  `classStartDate` date NOT NULL,
  `classEndDate` date DEFAULT NULL,
  `classStartTime` time NOT NULL,
  `classEndTime` time NOT NULL,
  `classDays` varchar(45) NOT NULL,
  PRIMARY KEY (`idClassTable`),
  KEY `fk_classTable_styleTable1_idx` (`idStyleTable`),
  KEY `Fk_userTable_idx` (`idUserTable`),
  CONSTRAINT `Fk_userTable` FOREIGN KEY (`idUserTable`) REFERENCES `usertable` (`idUserTable`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_classTable_styleTable1` FOREIGN KEY (`idStyleTable`) REFERENCES `styletable` (`idStyleTable`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classtable`
--

INSERT INTO `classtable` VALUES (1,3,1,'2017-11-26','2018-11-26','16:35:00','17:35:00','Monday Wednesday '),(2,2,2,'2017-11-26','2018-01-26','19:00:00','20:00:00','Tuesday Thursday '),(3,3,1,'2017-11-30','2017-12-30','16:00:00','17:00:00','Monday Wednesday '),(4,2,2,'2017-11-30','2018-01-30','19:00:00','20:00:00','Tuesday Thursday '),(5,3,1,'2017-10-30','2017-12-30','18:50:00','19:50:00','Monday Friday ');

--
-- Table structure for table `gendertable`
--

DROP TABLE IF EXISTS `gendertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gendertable` (
  `idGenderTable` int(11) NOT NULL AUTO_INCREMENT,
  `genderName` varchar(45) NOT NULL,
  PRIMARY KEY (`idGenderTable`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gendertable`
--

INSERT INTO `gendertable` VALUES (1,'male'),(2,'female');

--
-- Table structure for table `sectiontable`
--

DROP TABLE IF EXISTS `sectiontable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sectiontable` (
  `idSectionTable` int(11) NOT NULL AUTO_INCREMENT,
  `idClassTable` int(11) NOT NULL,
  `idStatusTable` int(11) NOT NULL,
  `sectionDay` varchar(45) NOT NULL,
  PRIMARY KEY (`idSectionTable`),
  KEY `fk_sectionTable_classTable2_idx` (`idClassTable`),
  KEY `fk_sectionTable_statusTable2_idx` (`idStatusTable`),
  CONSTRAINT `fk_idClassTable2` FOREIGN KEY (`idClassTable`) REFERENCES `classtable` (`idClassTable`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idStatusTable2` FOREIGN KEY (`idStatusTable`) REFERENCES `statustable` (`idStatusTable`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sectiontable`
--

INSERT INTO `sectiontable` VALUES (1,4,1,'Tuesday'),(2,4,1,'Thursday'),(3,5,1,'Monday'),(4,5,1,'Friday');

--
-- Table structure for table `statustable`
--

DROP TABLE IF EXISTS `statustable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statustable` (
  `idStatusTable` int(11) NOT NULL AUTO_INCREMENT,
  `statusName` varchar(25) NOT NULL,
  PRIMARY KEY (`idStatusTable`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statustable`
--

INSERT INTO `statustable` VALUES (1,'active'),(2,'desactive'),(3,'expected');

--
-- Table structure for table `styletable`
--

DROP TABLE IF EXISTS `styletable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `styletable` (
  `idStyleTable` int(11) NOT NULL AUTO_INCREMENT,
  `styleName` varchar(45) NOT NULL,
  PRIMARY KEY (`idStyleTable`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `styletable`
--

INSERT INTO `styletable` VALUES (1,'salsa'),(2,'bachata'),(3,'tango'),(4,'mambo');

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_roles` (
  `user_name` varchar(15) NOT NULL,
  `role_name` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

INSERT INTO `user_roles` VALUES ('admin','administrator');

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `user_name` varchar(15) NOT NULL,
  `user_pass` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

INSERT INTO `users` VALUES ('admin','admin');

--
-- Table structure for table `usertable`
--

DROP TABLE IF EXISTS `usertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usertable` (
  `idUserTable` int(11) NOT NULL AUTO_INCREMENT,
  `idGenderTable` int(11) NOT NULL,
  `idStatusTable` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `userPassword` varchar(45) NOT NULL,
  `userEmail` varchar(45) NOT NULL,
  `userFirstName` varchar(45) NOT NULL,
  `userLastName` varchar(45) NOT NULL,
  `userDate` date NOT NULL,
  `userPhoto` varchar(45) DEFAULT NULL,
  `userRole` varchar(15) NOT NULL,
  PRIMARY KEY (`idUserTable`),
  KEY `fk_dancerTable_genderTable1_idx` (`idGenderTable`),
  KEY `fk_userTable_statusTable1_idx` (`idStatusTable`),
  CONSTRAINT `fk_idGenderTable` FOREIGN KEY (`idGenderTable`) REFERENCES `gendertable` (`idGenderTable`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idStatusTable` FOREIGN KEY (`idStatusTable`) REFERENCES `statustable` (`idStatusTable`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` VALUES (1,1,1,'livancito','1234','livan@gmail.com','Livan','Hernandez U','2017-11-24','','dancer'),(2,1,1,'aguja','1234','aguja@gmail.com','Ivan','Hernandez','2017-11-24','','administrator'),(3,1,1,'tito','1234','tito@gmail.com','Tito Bambino','Polanco','2017-11-25','','teacher'),(4,2,1,'Lynde','1234','lynde@gmaiil.com','Lynde','Hernandez','2017-11-25','','dancer'),(5,1,1,'tato','1234','carlos@gmail.com','Carlos','Solano','2017-11-25','','dancer'),(6,1,1,'ignacio','1234','ignacio@gmail.com','ignacio','Hernandez','2017-11-28','','dancer'),(7,2,1,'ivelisse','1234','ivelisse@gmail.com','ivelisse','Hernandez','2017-11-28','','dancer'),(8,1,1,'hilario','1234','hilario@gmail.com','hilario','hernandez','2017-11-28','','dancer');

--
-- Table structure for table `visitorstable`
--

DROP TABLE IF EXISTS `visitorstable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `visitorstable` (
  `idVisitorsTable` int(11) NOT NULL AUTO_INCREMENT,
  `idSectionTable` int(11) NOT NULL,
  `idUserTable` int(11) NOT NULL,
  `idStatusTable` int(11) NOT NULL,
  `whenSignedIn` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`idVisitorsTable`),
  KEY `Fk_userId_idx` (`idUserTable`),
  KEY `Fk_statusId_idx` (`idStatusTable`),
  KEY `Fk_sectonId_dx` (`idSectionTable`),
  CONSTRAINT `fk_idSectionTable_details` FOREIGN KEY (`idSectionTable`) REFERENCES `sectiontable` (`idSectionTable`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idStatusTable_details` FOREIGN KEY (`idStatusTable`) REFERENCES `statustable` (`idStatusTable`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idUserTable_details` FOREIGN KEY (`idUserTable`) REFERENCES `usertable` (`idUserTable`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitorstable`
--

INSERT INTO `visitorstable` VALUES (1,1,1,3,'2017-12-01 21:02:27'),(2,1,4,3,'2017-12-01 21:03:46'),(3,1,5,3,'2017-12-01 22:18:52'),(4,4,1,3,'2017-12-01 22:20:09');
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-02 11:41:35
