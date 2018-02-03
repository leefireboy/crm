-- 初始化数据库脚本

-- 创建crm数据库
CREATE DATABASE IF NOT EXISTS crm CHARACTER SET utf8;

-- 创建客户信息表
CREATE TABLE IF NOT EXISTS customer (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  name VARCHAR(60) NOT NULL COMMENT '客户名称',
  sex SMALLINT NOT NULL COMMENT '客户性别',
  contact1 VARCHAR(11) NOT NULL DEFAULT '00000000000' COMMENT '联系方式1',
  contact2 VARCHAR(11) COMMENT '联系方式2',
  contact3 VARCHAR(11) COMMENT '联系方式3',
  email VARCHAR(30) COMMENT '邮箱',
  address VARCHAR(300) COMMENT '地址',
  birthday DATE DEFAULT '1970-01-01' COMMENT '生日',
  id_card VARCHAR(18) COMMENT '身份证',
  interest VARCHAR(60) COMMENT '爱好',
  score MEDIUMINT COMMENT '积分',
  need VARCHAR(120) COMMENT '客户需求',
  impression VARCHAR(300) COMMENT '印象',
  company_id BIGINT COMMENT '公司ID',
  invoice_id BIGINT COMMENT '发票ID',
  remarks VARCHAR(300) COMMENT '备注',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_name VARCHAR(30) NOT NULL COMMENT '创建人',
  is_enable BOOLEAN NOT NULL DEFAULT TRUE COMMENT '是否有效',
  PRIMARY KEY (id),
  KEY idx_name (name),
  KEY idx_contact (contact1, contact2, contact3),
  KEY idx_create_time (create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '客户信息表';

# INSERT INTO company(id, name, tax_no, address, business, is_country, contact_person, office, mobile_phone, telephone, sex, create_time, need, enable) VALUES ();

-- 创建公司信息表
CREATE TABLE IF NOT EXISTS company (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '公司ID',
  name VARCHAR(60) NOT NULL COMMENT '公司名称',
  email VARCHAR(30) COMMENT '邮箱',
  address VARCHAR(300) COMMENT '地址',
  net VARCHAR(30) COMMENT '网址',
  reg_cap INT COMMENT '注册资金',
  need VARCHAR(120) COMMENT '客户需求',
  nature SMALLINT COMMENT '企业性质',
  invoice_id BIGINT COMMENT '发票ID',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_name VARCHAR(30) NOT NULL COMMENT '创建人',
  is_enable BOOLEAN NOT NULL DEFAULT TRUE COMMENT '是否有效',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '公司信息表';

-- 创建开票信息表
CREATE TABLE IF NOT EXISTS invoice_information (
  id BIGINT NOT NULL COMMENT '客户ID',
  name VARCHAR(60) NOT NULL COMMENT '抬头',
  unique_no VARCHAR(18) COMMENT '唯一ID',
  address VARCHAR(300) COMMENT '地址',
  telephone VARCHAR(15) COMMENT '电话',
  open_bank VARCHAR(60) COMMENT '开户银行',
  open_bank_no VARCHAR(20) COMMENT '开户银行卡号',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_name VARCHAR(30) NOT NULL COMMENT '创建人',
  is_enable BOOLEAN NOT NULL DEFAULT TRUE COMMENT '是否有效',
  KEY idx_customer_id (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT '开票信息表';

-- 创界客户联系人表