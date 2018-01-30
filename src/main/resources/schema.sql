-- 初始化数据库脚本

-- 创建crm数据库
CREATE DATABASE IF NOT EXISTS crm CHARACTER SET utf8;

-- 创建客户信息表
CREATE TABLE IF NOT EXISTS company (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '公司ID',
  name VARCHAR(60) NOT NULL COMMENT '公司名称',
  tax_no VARCHAR(18) NOT NULL COMMENT '公司税号',
  address VARCHAR(300) NOT NULL COMMENT '公司地址电话',
  business VARCHAR(60) NOT NULL COMMENT '经营范围',
  is_country BOOLEAN NOT NULL COMMENT '是否国企',
  contact_person VARCHAR(60) NOT NULL COMMENT '公司联系人',
  office VARCHAR(30) NOT NULL DEFAULT '经理' COMMENT '公司职位',
  mobile_phone VARCHAR(15) COMMENT '公司联系人手机',
  telephone VARCHAR(15) COMMENT '公司联系人座机',
  sex BOOLEAN NOT NULL COMMENT '公司联系人性别',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  need VARCHAR(120) COMMENT '客户需求',
  enable BOOLEAN NOT NULL DEFAULT TRUE COMMENT '是否有效',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '消费公司';

# INSERT INTO company(id, name, tax_no, address, business, is_country, contact_person, office, mobile_phone, telephone, sex, create_time, need, enable) VALUES ();

-- 创建客户表
CREATE TABLE IF NOT EXISTS customer (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  name VARCHAR(60) NOT NULL COMMENT '客户名称',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  enable BOOLEAN NOT NULL DEFAULT TRUE COMMENT '是否有效',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '客户表';

-- 创建开票信息表
CREATE TABLE IF NOT EXISTS invoice_information (
  customer_id BIGINT NOT NULL COMMENT '客户ID',
  name VARCHAR(60) NOT NULL COMMENT '抬头',
  unique_id VARCHAR(18) COMMENT '唯一ID',
  address VARCHAR(300) COMMENT '地址',
  telephone VARCHAR(15) COMMENT '电话',
  opening_bank VARCHAR(60) COMMENT '开户银行',
  bank_no VARCHAR(20) COMMENT '开户银行卡号',
  KEY idx_customer_id (customer_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '开票信息表';

-- 创界客户联系人表