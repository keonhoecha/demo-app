CREATE TABLE `signup`.`term` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `startOn` DATETIME NULL,
  `endOn` DATETIME NULL,
  `createdOn` DATETIME NULL,
  `createdBy` VARCHAR(45) NULL,
  `modifiedOn` DATETIME NULL,
  `modifiedBy` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `signup`.`enrollment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `termId` INT NOT NULL,
  `description` VARCHAR(250) NULL,
  `openOn` DATETIME NOT NULL,
  `closeOn` DATETIME NOT NULL,
  `createdOn` DATETIME NULL,
  `createdBy` VARCHAR(45) NULL,
  `modifiedOn` DATETIME NULL,
  `modifiedBy` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `signup`.`enroll` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `classId` INT NOT NULL,
  `enrollmentId` INT NOT NULL,
  `fullName` VARCHAR(150) NOT NULL,
  `createdOn` DATETIME NULL,
  `createdBy` VARCHAR(45) NULL,
  `modifiedOn` DATETIME NULL,
  `modifiedBy` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `signup`.`class` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `termId` INT NULL,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(1000) NULL,
  `instructor` VARCHAR(100) NULL,
  `capacity` INT NULL,
  `createdOn` DATETIME NULL,
  `createdBy` VARCHAR(45) NULL,
  `modifiedOn` DATETIME NULL,
  `modifiedBy` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));