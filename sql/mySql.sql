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
-- Table structure for table `gendertable`
--

DROP TABLE IF EXISTS `gendertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gendertable` (
  `idGenderTable` int(11) NOT NULL,
  `genderName` varchar(45) NOT NULL,
  PRIMARY KEY (`idGenderTable`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gendertable`
--

LOCK TABLES `gendertable` WRITE;
/*!40000 ALTER TABLE `gendertable` DISABLE KEYS */;
INSERT INTO `gendertable` VALUES (1,'Male'),(2,'Famale'),(3,'Famale'),(4,'Famale'),(5,'Famale'),(6,'Famale'),(7,'Famale'),(8,'Famale'),(9,'Famale'),(10,'Famale'),(11,'Famale'),(12,'Famale'),(13,'Famale'),(14,'Famale'),(15,'Famale'),(16,'Famale'),(17,'Famale'),(18,'Famale'),(19,'Famale'),(20,'Famale'),(21,'Famale'),(22,'Famale'),(23,'Famale'),(24,'Famale'),(25,'Famale'),(26,'Famale');
/*!40000 ALTER TABLE `gendertable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `statustable`
--

DROP TABLE IF EXISTS `statustable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `statustable` (
  `id_statustable` int(11) NOT NULL AUTO_INCREMENT,
  `statusname` varchar(25) NOT NULL,
  PRIMARY KEY (`id_statustable`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `statustable`
--

LOCK TABLES `statustable` WRITE;
/*!40000 ALTER TABLE `statustable` DISABLE KEYS */;
INSERT INTO `statustable` VALUES (1,'new record'),(2,'Ivan'),(3,'new record');
/*!40000 ALTER TABLE `statustable` ENABLE KEYS */;
UNLOCK TABLES;

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

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES ('admin','administrator');
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

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

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('admin','admin');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usertable`
--

DROP TABLE IF EXISTS `usertable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usertable` (
  `idUserTable` int(11) NOT NULL,
  `userName` varchar(45) NOT NULL,
  `userPassword` varchar(45) DEFAULT NULL,
  `userEmail` varchar(45) NOT NULL,
  `userFirstName` varchar(45) DEFAULT NULL,
  `userLastName` varchar(45) DEFAULT NULL,
  `userDate` datetime NOT NULL,
  `genderTable_idGenderTable` int(11) NOT NULL,
  `userPhoto` varchar(45) DEFAULT NULL,
  `userRole` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`idUserTable`),
  KEY `fk_dancerTable_genderTable1_idx` (`genderTable_idGenderTable`),
  CONSTRAINT `fk_dancerTable_genderTable1` FOREIGN KEY (`genderTable_idGenderTable`) REFERENCES `gendertable` (`idGenderTable`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usertable`
--

LOCK TABLES `usertable` WRITE;
/*!40000 ALTER TABLE `usertable` DISABLE KEYS */;
INSERT INTO `usertable` VALUES (1,'aguja','1234','hernandez12052011@gmail.com','Ivan','Hernandez','2017-10-08 00:00:00',1,'','administrator'),(2,'niño','1234','evanroger@gmail.com','Evan','Hernandez','2017-10-11 00:00:00',1,'','dancer');
/*!40000 ALTER TABLE `usertable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-15 11:40:13
