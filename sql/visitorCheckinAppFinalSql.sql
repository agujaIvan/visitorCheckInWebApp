-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema visitorCheckInAppDb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `visitorCheckInAppDb` ;

-- -----------------------------------------------------
-- Schema visitorCheckInAppDb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `visitorCheckInAppDb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------

USE `visitorCheckInAppDb` ;


CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`genderTable` (
  `idGenderTable` INT NOT NULL AUTO_INCREMENT,
  `genderName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idGenderTable`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`statusTable` (
  `idStatusTable` INT NOT NULL AUTO_INCREMENT,
  `statusName` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`idStatusTable`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`styleTable` (
  `idStyleTable` INT NOT NULL AUTO_INCREMENT,
  `styleName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idStyleTable`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`userTable` (
  `idUserTable` INT NOT NULL AUTO_INCREMENT,
  `idGenderTable` INT NOT NULL,
  `idStatusTable` INT NOT NULL,
  `userName` VARCHAR(45) NOT NULL,
  `userPassword` VARCHAR(45) NOT NULL,
  `userEmail` VARCHAR(45) NOT NULL,
  `userFirstName` VARCHAR(45) NOT NULL,
  `userLastName` VARCHAR(45) NOT NULL,
  `userDate` DATE NOT NULL,
  `userPhoto` VARCHAR(45) NULL,
  `userRole` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`idUserTable`),
  INDEX `fk_dancerTable_genderTable1_idx` (`idGenderTable` ASC),
  INDEX `fk_userTable_statusTable1_idx` (`idStatusTable` ASC),
  CONSTRAINT `fk_idGenderTable`
    FOREIGN KEY (`idGenderTable`)
    REFERENCES `visitorCheckInAppDb`.`genderTable` (`idGenderTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idStatusTable`
    FOREIGN KEY (`idStatusTable`)
    REFERENCES `visitorCheckInAppDb`.`statusTable` (`idStatusTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`classTable` (
  `idClassTable` INT NOT NULL AUTO_INCREMENT,
  `idUserTable` INT NOT NULL,
  `idStyleTable` INT NOT NULL,
  `classStartDate` DATE NOT NULL,
  `classEndDate` DATE NULL,
  `classStartTime` TIME NOT NULL,
  `classEndTime` TIME NOT NULL,
  `classDays` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idClassTable`),
  INDEX `fk_classTable_styleTable1_idx` (`idStyleTable` ASC),
  INDEX `Fk_userTable_idx` (`idUserTable` ASC),
  CONSTRAINT `fk_classTable_styleTable1`
    FOREIGN KEY (`idStyleTable`)
    REFERENCES `visitorCheckInAppDb`.`styleTable` (`idStyleTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `Fk_userTable`
    FOREIGN KEY (`idUserTable`)
    REFERENCES `visitorCheckInAppDb`.`userTable` (`idUserTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`sectionTable` (
  `idSectionTable` INT NOT NULL AUTO_INCREMENT,
  `idClassTable` INT NOT NULL,
  `idStatusTable` INT NOT NULL,
  `sectionDay` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idSectionTable`),
  INDEX `fk_sectionTable_classTable2_idx` (`idClassTable` ASC),
  INDEX `fk_sectionTable_statusTable2_idx` (`idStatusTable` ASC),
  CONSTRAINT `fk_idClassTable2`
    FOREIGN KEY (`idClassTable`)
    REFERENCES `visitorCheckInAppDb`.`classTable` (`idClassTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idStatusTable2`
    FOREIGN KEY (`idStatusTable`)
    REFERENCES `visitorCheckInAppDb`.`statusTable` (`idStatusTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `visitorCheckInAppDb`.`visitorsTable` (
  `idVisitorsTable` INT NOT NULL AUTO_INCREMENT,
  `idSectionTable` INT NOT NULL,
  `idUserTable` INT NOT NULL,
  `idStatusTable` INT NOT NULL,
  `whenSignedIn` TIMESTAMP NOT NULL,
  PRIMARY KEY (`idVisitorsTable`),
  INDEX `Fk_userId_idx` (`idUserTable` ASC),
  INDEX `Fk_statusId_idx` (`idStatusTable` ASC),
  INDEX `Fk_sectonId_dx` (`idSectionTable` ASC),
  CONSTRAINT `fk_idSectionTable_details`
    FOREIGN KEY (`idSectionTable`)
    REFERENCES `visitorCheckInAppDb`.`sectionTable` (`idSectionTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idUserTable_details`
    FOREIGN KEY (`idUserTable`)
    REFERENCES `visitorCheckInAppDb`.`userTable` (`idUserTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_idStatusTable_details`
    FOREIGN KEY (`idStatusTable`)
    REFERENCES `visitorCheckInAppDb`.`statusTable` (`idStatusTable`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `visitorCheckInAppDb`.`styleTable`
-- -----------------------------------------------------
START TRANSACTION;
USE `visitorCheckInAppDb`;
INSERT INTO `visitorCheckInAppDb`.`styleTable` (`idStyleTable`, `styleName`) VALUES (1, 'salsa');

COMMIT;


-- -----------------------------------------------------
-- Data for table `visitorCheckInAppDb`.`statusTable`
-- -----------------------------------------------------
START TRANSACTION;
USE `visitorCheckInAppDb`;
INSERT INTO `visitorCheckInAppDb`.`statusTable` (`idStatusTable`, `statusName`) VALUES (1, 'active');
INSERT INTO `visitorCheckInAppDb`.`statusTable` (`idStatusTable`, `statusName`) VALUES (2, 'desactive');
INSERT INTO `visitorCheckInAppDb`.`statusTable` (`idStatusTable`, `statusName`) VALUES (3, 'expected');
INSERT INTO `visitorCheckInAppDb`.`statusTable` (`idStatusTable`, `statusName`) VALUES (4, 'signedin');

COMMIT;


-- -----------------------------------------------------
-- Data for table `visitorCheckInAppDb`.`genderTable`
-- -----------------------------------------------------
START TRANSACTION;
USE `visitorCheckInAppDb`;
INSERT INTO `visitorCheckInAppDb`.`genderTable` (`idGenderTable`, `genderName`) VALUES (1, 'male');
INSERT INTO `visitorCheckInAppDb`.`genderTable` (`idGenderTable`, `genderName`) VALUES (2, 'famale');

COMMIT;


-- -----------------------------------------------------
-- Data for table `visitorCheckInAppDb`.`userTable`
-- -----------------------------------------------------
START TRANSACTION;
USE `visitorCheckInAppDb`;
INSERT INTO `visitorCheckInAppDb`.`userTable` (`idUserTable`, `idGenderTable`, `idStatusTable`, `userName`, `userPassword`, `userEmail`, `userFirstName`, `userLastName`, `userDate`, `userPhoto`, `userRole`) VALUES (1, 1, 1, 'aguja', '1234', 'aguja@gmail.com', 'Ivan', 'Hernandez', '2017-10-10', NULL, 'administrator');

COMMIT;