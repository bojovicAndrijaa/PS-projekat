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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `destinacijavoznje` */

insert  into `destinacijavoznje`(`VoznjaID`,`PostanskiBroj`,`RedniBroj`) values 
(1,21000,10),
(3,23300,12),
(2,31300,11);

/*Table structure for table `korisnik` */

DROP TABLE IF EXISTS `korisnik`;

CREATE TABLE `korisnik` (
  `KorisnickoIme` varchar(100) NOT NULL,
  `Lozinka` varchar(100) NOT NULL,
  PRIMARY KEY (`KorisnickoIme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `korisnik` */

insert  into `korisnik`(`KorisnickoIme`,`Lozinka`) values 
('andrija','andrija');

/*Table structure for table `masinovodja` */

DROP TABLE IF EXISTS `masinovodja`;

CREATE TABLE `masinovodja` (
  `MasinovodjaID` bigint unsigned NOT NULL AUTO_INCREMENT,
  `Ime` varchar(30) NOT NULL,
  `Prezime` varchar(50) NOT NULL,
  `DatumRodjenja` date NOT NULL,
  `RadniStaz` int NOT NULL,
  PRIMARY KEY (`MasinovodjaID`)
) ENGINE=InnoDB AUTO_INCREMENT=111111112 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `masinovodja` */

insert  into `masinovodja`(`MasinovodjaID`,`Ime`,`Prezime`,`DatumRodjenja`,`RadniStaz`) values 
(1,'Andrija','Bojovic','2000-07-15',3),
(2,'Milos','Kostic','1978-05-03',25),
(3,'Jovan','Milovanovic','1965-11-03',45);

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
(11500,'Obrenovac'),
(21000,'Novi Sad'),
(23300,'Kikinda'),
(31000,'Uzice'),
(31300,'Prijepolje'),
(34000,'Kragujevac'),
(37000,'Krusevac'),
(37230,'Aleksandrovac');

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
) ENGINE=InnoDB AUTO_INCREMENT=54232123113 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `voz` */

insert  into `voz`(`VozID`,`NazivVoza`,`BrojSedista`,`GodinaProizvodnje`,`VrstaVoza`) values 
(1,'Cira',60,'1953-09-05',3),
(2,'Soko',250,'2022-02-03',2),
(3,'Plavi voz',100,'1958-08-14',1);

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
(1,34,'2023-07-08 17:15:35',1,2),
(2,150,'2023-07-09 12:30:00',1,1),
(3,80,'2023-07-10 15:45:15',3,1);

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
