DROP SCHEMA IF EXISTS `superstore`;

CREATE SCHEMA `superstore` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `superstore`;

CREATE TABLE superstore.customer (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `last_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `phone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `customer_FK` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

CREATE TABLE superstore.`order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_id` int(11) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`),
  KEY `order_FK` (`customer_id`),
  KEY `order_FK_1` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE superstore.`product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `base_cost` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE superstore.`order_item` (
  `order_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  KEY `order_item_FK` (`order_id`),
  KEY `order_item_FK_1` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE superstore.`address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `street` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `state` varchar(100) DEFAULT NULL,
  `zip` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE superstore.`warehouse` (
  `warehouse_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`warehouse_id`),
  KEY `warehouse_FK` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE superstore.product_warehouse (
  `product_id` int(11) DEFAULT NULL,
  `warehouse_id` int(11) DEFAULT NULL,
  KEY `product_warehouse_FK` (`product_id`),
  KEY `product_warehouse_FK_1` (`warehouse_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

ALTER TABLE superstore.customer ADD CONSTRAINT customer_FK FOREIGN KEY (address_id) REFERENCES superstore.address(address_id);
ALTER TABLE superstore.`order` ADD CONSTRAINT order_FK FOREIGN KEY (address_id) REFERENCES superstore.address(address_id);
ALTER TABLE superstore.`order` ADD CONSTRAINT order_FK_1 FOREIGN KEY (customer_id) REFERENCES superstore.customer(customer_id);
ALTER TABLE superstore.order_item ADD CONSTRAINT order_item_FK FOREIGN KEY (product_id) REFERENCES superstore.product(product_id);
ALTER TABLE superstore.order_item ADD CONSTRAINT order_item_FK_1 FOREIGN KEY (order_id) REFERENCES superstore.`order`(order_id);
ALTER TABLE superstore.product_warehouse ADD CONSTRAINT product_warehouse_FK FOREIGN KEY (product_id) REFERENCES superstore.product(product_id);
ALTER TABLE superstore.product_warehouse ADD CONSTRAINT product_warehouse_FK_1 FOREIGN KEY (warehouse_id) REFERENCES superstore.warehouse(warehouse_id);
ALTER TABLE superstore.warehouse ADD CONSTRAINT warehouse_FK FOREIGN KEY (address_id) REFERENCES superstore.address(address_id);
