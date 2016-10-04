--Created in mysql dB

CREATE SCHEMA `loginapp` ;
  
  CREATE TABLE `user_info` (
  `User_id` int(11) NOT NULL AUTO_INCREMENT,
  `User_name` varchar(45) DEFAULT NULL,
  `User_pwd` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`User_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
  
 SELECT * FROM loginapp.user_info;

 
 INSERT INTO `loginapp`.`user_info` (`User_name`, `User_pwd`) VALUES ('', '');
