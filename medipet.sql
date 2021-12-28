/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.17-log : Database - medipet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`medipet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `medipet`;

/*Table structure for table `mascota` */

DROP TABLE IF EXISTS `mascota`;

CREATE TABLE `mascota` (
  `id_mascota` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_mascota` varchar(50) NOT NULL,
  `edad` int(3) NOT NULL,
  `tipo_mascota` varchar(30) NOT NULL,
  `check_aten_previas` bit(1) DEFAULT NULL,
  `cant_aten_previas` int(11) DEFAULT '0',
  `check_duenho` bit(1) DEFAULT NULL,
  `nombre_duenho` varchar(50) DEFAULT NULL,
  `descripcion` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id_mascota`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

/*Data for the table `mascota` */

/*insert  into `mascota`(`id_mascota`,`nombre_mascota`,`edad`,`tipo_mascota`,`check_aten_previas`,`cant_aten_previas`,`check_duenho`,`nombre_duenho`,`descripcion`) values (1,'BAMBÚ',3,'GATO','\0',0,'\0','WASHI','GATO DE GRAN TAMAÑO'),(2,'PIRAÑA',5,'TIGRE','',4,'\0','ALBI','MUY INQUIETO'),(3,'PILLÍN',8,'PERRO','',3,'\0','KUBO','EL MEJOR PERRO DEL MUNDO, LO EXTRAÑO'),(4,'SIMBA',2,'TORTUGA','\0',0,'\0','RUTA','LA TORTUGA SE CREE GATO'),(5,'PINGUI',1,'PINGUINO','\0',0,'\0','PINGUINITA','NO SE COMO TIENE UNA PINGUINA');*/

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
