/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.31 : Database - projekat
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projekat` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `projekat`;

/*Table structure for table `destinacija voznje` */

DROP TABLE IF EXISTS `destinacija voznje`;

CREATE TABLE `destinacija voznje` (
  `VoznjaID` bigint unsigned NOT NULL,
  `PostanskiBroj` bigint unsigned NOT NULL,
  `RedniBroj` int NOT NULL,
  PRIMARY KEY (`VoznjaID`,`RedniBroj`),
  KEY `PostanskiBroj` (`PostanskiBroj`),
  CONSTRAINT `destinacija voznje_ibfk_1` FOREIGN KEY (`PostanskiBroj`) REFERENCES `mesto` (`PostanskiBroj`) ON UPDATE RESTRICT,
  CONSTRAINT `destinacija voznje_ibfk_2` FOREIGN KEY (`VoznjaID`) REFERENCES `voznja` (`VoznjaID`) ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `destinacija voznje` */

/*Table structure for table `masinovodja` */

DROP TABLE IF EXISTS `masinovodja`;

CREATE TABLE `masinovodja` (
  `MasinovodjaID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `Ime` varchar(30) NOT NULL,
  `Prezime` varchar(50) NOT NULL,
  `DatumRodjenja` date NOT NULL,
  `RadniStaz` int NOT NULL,
  PRIMARY KEY (`MasinovodjaID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `masinovodja` */

insert  into `masinovodja`(`MasinovodjaID`,`Ime`,`Prezime`,`DatumRodjenja`,`RadniStaz`) values 
(1,'Gojko','Perovic','1968-11-05',10),
(2,'Zoran','Jevtic','1918-08-01',40);

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `PostanskiBroj` bigint unsigned NOT NULL,
  `Naziv` varchar(80) NOT NULL,
  PRIMARY KEY (`PostanskiBroj`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `mesto` */

insert  into `mesto`(`PostanskiBroj`,`Naziv`) values 
(11000,'Beograd'),
(31300,'Prijepolje');

/*Table structure for table `voz` */

DROP TABLE IF EXISTS `voz`;

CREATE TABLE `voz` (
  `VozID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `NazivVoza` varchar(80) NOT NULL,
  `BrojSedista` int unsigned NOT NULL,
  `GodinaProizvodnje` date NOT NULL,
  `VrstaVoza` bigint unsigned NOT NULL,
  PRIMARY KEY (`VozID`),
  KEY `VrstaVoza` (`VrstaVoza`),
  CONSTRAINT `voz_ibfk_1` FOREIGN KEY (`VrstaVoza`) REFERENCES `vrsta voza` (`VrstaVozaID`) ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `voz` */

insert  into `voz`(`VozID`,`NazivVoza`,`BrojSedista`,`GodinaProizvodnje`,`VrstaVoza`) values 
(1,'Cira',50,'1912-01-07',3),
(2,'Soko',150,'2022-09-01',1);

/*Table structure for table `voznja` */

DROP TABLE IF EXISTS `voznja`;

CREATE TABLE `voznja` (
  `VoznjaID` bigint unsigned NOT NULL,
  `Trajanje` int NOT NULL,
  `Datum` date NOT NULL,
  `MasinovodjaID` bigint unsigned NOT NULL,
  `VozID` bigint unsigned NOT NULL,
  PRIMARY KEY (`VoznjaID`),
  KEY `MasinovodjaID` (`MasinovodjaID`),
  KEY `VozID` (`VozID`),
  CONSTRAINT `voznja_ibfk_1` FOREIGN KEY (`MasinovodjaID`) REFERENCES `masinovodja` (`MasinovodjaID`) ON UPDATE RESTRICT,
  CONSTRAINT `voznja_ibfk_2` FOREIGN KEY (`VozID`) REFERENCES `voz` (`VozID`) ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `voznja` */

/*Table structure for table `vrsta voza` */

DROP TABLE IF EXISTS `vrsta voza`;

CREATE TABLE `vrsta voza` (
  `VrstaVozaID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `NazivVrste` varchar(200) NOT NULL,
  PRIMARY KEY (`VrstaVozaID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `vrsta voza` */

insert  into `vrsta voza`(`VrstaVozaID`,`NazivVrste`) values 
(1,'Medjugradski'),
(2,'Ekspresni'),
(3,'Regionalni');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
