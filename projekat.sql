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

/*Table structure for table `destinacijavoznje` */

DROP TABLE IF EXISTS `destinacijavoznje`;

CREATE TABLE `destinacijavoznje` (
  `VoznjaID` bigint unsigned NOT NULL,
  `PostanskiBroj` bigint unsigned NOT NULL,
  `RedniBroj` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`VoznjaID`,`RedniBroj`),
  KEY `PostanskiBroj` (`PostanskiBroj`),
  KEY `RedniBroj` (`RedniBroj`),
  CONSTRAINT `destinacijavoznje_ibfk_1` FOREIGN KEY (`PostanskiBroj`) REFERENCES `mesto` (`PostanskiBroj`) ON UPDATE RESTRICT,
  CONSTRAINT `destinacijavoznje_ibfk_2` FOREIGN KEY (`VoznjaID`) REFERENCES `voznja` (`VoznjaID`) ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `destinacijavoznje` */

insert  into `destinacijavoznje`(`VoznjaID`,`PostanskiBroj`,`RedniBroj`) values 
(1,21000,3),
(145,31300,1),
(4444,34000,2);

/*Table structure for table `masinovodja` */

DROP TABLE IF EXISTS `masinovodja`;

CREATE TABLE `masinovodja` (
  `MasinovodjaID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `Ime` varchar(30) NOT NULL,
  `Prezime` varchar(50) NOT NULL,
  `DatumRodjenja` date NOT NULL,
  `RadniStaz` int NOT NULL,
  PRIMARY KEY (`MasinovodjaID`)
) ENGINE=InnoDB AUTO_INCREMENT=112234 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `masinovodja` */

insert  into `masinovodja`(`MasinovodjaID`,`Ime`,`Prezime`,`DatumRodjenja`,`RadniStaz`) values 
(1,'Gojko','Perovic','1968-11-05',10),
(2,'Zoran','Jevtic','1918-08-01',40),
(3,'Marko','Markovic','2023-05-18',13),
(4,'Milenko','Milanovic','1996-10-09',5),
(5,'Boris','Mandic','2000-11-17',1),
(6,'Filip','Novkovic','2000-07-26',2),
(7,'Jovan','Jovanovic','1970-07-09',43),
(7458,'Milovan','Popadic','2023-07-04',38),
(110700,'Andrija','Bojovic','3900-08-11',7),
(112233,'Mirko','Filipovic','1983-07-14',16);

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
(21000,'Novi Sad'),
(31000,'Uzice'),
(31300,'Prijepolje'),
(34000,'Kragujevac');

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
  CONSTRAINT `voz_ibfk_1` FOREIGN KEY (`VrstaVoza`) REFERENCES `vrstavoza` (`VrstaVozaID`) ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=988 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `voz` */

insert  into `voz`(`VozID`,`NazivVoza`,`BrojSedista`,`GodinaProizvodnje`,`VrstaVoza`) values 
(1,'Cira',50,'1912-01-07',3),
(2,'Soko',200,'2022-09-01',1),
(77,'Lokomotiva',48,'1975-07-17',2),
(123,'Plavi voz',1005,'3820-02-01',1),
(987,'Jastreb',125,'2023-07-06',3);

/*Table structure for table `voznja` */

DROP TABLE IF EXISTS `voznja`;

CREATE TABLE `voznja` (
  `VoznjaID` bigint unsigned NOT NULL,
  `Trajanje` int NOT NULL,
  `Datum` datetime NOT NULL,
  `MasinovodjaID` bigint unsigned NOT NULL,
  `VozID` bigint unsigned NOT NULL,
  PRIMARY KEY (`VoznjaID`),
  KEY `MasinovodjaID` (`MasinovodjaID`),
  KEY `VozID` (`VozID`),
  CONSTRAINT `voznja_ibfk_1` FOREIGN KEY (`MasinovodjaID`) REFERENCES `masinovodja` (`MasinovodjaID`) ON UPDATE RESTRICT,
  CONSTRAINT `voznja_ibfk_2` FOREIGN KEY (`VozID`) REFERENCES `voz` (`VozID`) ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `voznja` */

insert  into `voznja`(`VoznjaID`,`Trajanje`,`Datum`,`MasinovodjaID`,`VozID`) values 
(1,50,'2023-05-05 09:08:00',5,2),
(145,70,'2023-02-01 00:00:00',110700,123),
(4444,1,'2022-01-15 17:18:45',6,2);

/*Table structure for table `vrstavoza` */

DROP TABLE IF EXISTS `vrstavoza`;

CREATE TABLE `vrstavoza` (
  `VrstaVozaID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `NazivVrste` varchar(200) NOT NULL,
  PRIMARY KEY (`VrstaVozaID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `vrstavoza` */

insert  into `vrstavoza`(`VrstaVozaID`,`NazivVrste`) values 
(1,'Medjugradski'),
(2,'Ekspresni'),
(3,'Regionalni');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
