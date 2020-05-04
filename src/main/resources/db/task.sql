DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
     `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
     `course` varchar(100) DEFAULT NULL,
     `score` int(3) DEFAULT NULL,
     `student_id` int(11) NOT NULL,
     PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;

INSERT INTO `score` (`id`, `course`, `score`, `student_id`)
VALUES
(1,'Math',100,1),
(2,'Math',78,2),
(3,'Math',89,3),
(4,'Math',70,4),
(5,'Math',89,5),
(6,'Biology',78,1),
(7,'Biology',67,2),
(8,'Biology',78,3),
(9,'Biology',89,4);

/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `student_presence`;

CREATE TABLE `student_presence` (
    `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
    `date` date DEFAULT NULL,
    `student_card_id` varchar(100) NOT NULL DEFAULT '',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `student_presence` WRITE;
/*!40000 ALTER TABLE `student_presence` DISABLE KEYS */;

INSERT INTO `student_presence` (`id`, `date`, `student_card_id`)
VALUES
(1,'2019-05-01','abcd123'),
(2,'2019-05-01','abcd124'),
(3,'2019-05-01','abcd111'),
(4,'2019-05-01','abcd120'),
(5,'2019-05-02','abcd123'),
(6,'2019-05-02','abcd122'),
(7,'2019-05-02','abcd121'),
(8,'2019-05-02','abcd124'),
(9,'2019-05-02','abcd120'),
(10,'2019-05-03','abcd120'),
(11,'2019-05-03','abcd124'),
(12,'2019-05-03','abcd121'),
(13,'2019-05-03','abcd125'),
(14,'2019-05-04','abcd123'),
(15,'2019-05-04','abcd120');

/*!40000 ALTER TABLE `student_presence` ENABLE KEYS */;
UNLOCK TABLES;

DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
    `id` int(30) DEFAULT NULL,
    `name` varchar(100) DEFAULT NULL,
    `class` varchar(100) DEFAULT NULL,
    `student_id_card` varchar(100) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;

INSERT INTO `students` (`id`, `name`, `class`, `student_id_card`)
VALUES
(1,'Rheza','X','abcd123'),
(2,'John','Y','abcd124'),
(3,'Snow','XX','abcd121'),
(4,'Lan','XY','abcd120'),
(5,'Dan','MM','abcd122');

/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;
