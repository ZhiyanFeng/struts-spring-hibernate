SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `test`;
CREATE SCHEMA IF NOT EXISTS `test` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `test` ;

-- -----------------------------------------------------
-- Table `test`.`student`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `test`.`student` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  `gender` BOOLEAN NOT NULL, 
  PRIMARY KEY (`id`)
)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `test`.`category`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `test`.`category` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  `grade` INT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `test`.`student_category`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `test`.`student_category` (
  `student_id` INT NOT NULL,
  `category_id` INT NOT NULL,
  PRIMARY KEY (`category_id`,`student_id`),
  UNIQUE KEY `student_id_UNIQUE` (`student_id`),
  KEY `fk_category` (`category_id`),
  KEY `fk_student` (`student_id`),
  CONSTRAINT `fk_student` FOREIGN KEY (`student_id`) REFERENCES `test`.`student` (`id`) 
  ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_category` FOREIGN KEY (`category_id`) REFERENCES `test`.`category` (`id`) 
  ON DELETE CASCADE ON UPDATE CASCADE
  )
ENGINE = InnoDB;

/* insert raw date to category*/
INSERT INTO category (name, grade) VALUES
('TeacherA', 1),
('TeacherB', 2),
('TeacherC', 3),
('TeacherD', 4),
('TeacherE', 5),
('TeacherF', 6)
;

/* insert raw date to student*/
INSERT INTO student (name, gender) VALUES ('StudentA', 0);

/* insert raw date to student_category*/
INSERT INTO student_category (student_id, category_id) VALUES (1, 1);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
