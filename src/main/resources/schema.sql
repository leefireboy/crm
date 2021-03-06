-- 初始化数据库脚本

-- 创建crm数据库
CREATE DATABASE IF NOT EXISTS crm CHARACTER SET utf8;

-- 创建客户信息表
CREATE TABLE IF NOT EXISTS customer (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  name VARCHAR(60) NOT NULL COMMENT '客户名称',
  sex TINYINT NOT NULL DEFAULT 1 COMMENT '客户性别 0:女 1:男',
  contact1 VARCHAR(11) NOT NULL DEFAULT '00000000000' COMMENT '联系方式1',
  contact2 VARCHAR(11) COMMENT '联系方式2',
  contact3 VARCHAR(11) COMMENT '联系方式3',
  email VARCHAR(30) COMMENT '邮箱',
  address VARCHAR(300) COMMENT '地址',
  birthday DATE NOT NULL DEFAULT '1970-01-01' COMMENT '生日',
  id_card VARCHAR(18) COMMENT '身份证',
  interest VARCHAR(60) COMMENT '爱好',
  score MEDIUMINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '积分',
  need VARCHAR(120) COMMENT '客户需求',
  impression VARCHAR(300) COMMENT '印象',
  remarks VARCHAR(300) COMMENT '备注',
  company_id BIGINT NOT NULL DEFAULT 0 COMMENT '公司ID',
  invoice_id BIGINT NOT NULL DEFAULT 0 COMMENT '发票ID',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_name VARCHAR(30) NOT NULL COMMENT '创建人',
  is_enable TINYINT NOT NULL DEFAULT 1 COMMENT '是否有效 0:无效 1:有效',
  PRIMARY KEY (id),
  UNIQUE KEY idx_name_contact1 (name, contact1),
  KEY idx_name (name),
  KEY idx_contact (contact1, contact2, contact3),
  KEY idx_create_time (create_time)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '客户信息表';

-- 创建公司信息表
CREATE TABLE IF NOT EXISTS company (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '公司ID',
  name VARCHAR(60) NOT NULL COMMENT '公司名称',
  email VARCHAR(30) COMMENT '邮箱',
  address VARCHAR(300) COMMENT '地址',
  net VARCHAR(30) COMMENT '网址',
  reg_cap INT UNSIGNED COMMENT '注册资金',
  need VARCHAR(120) COMMENT '客户需求',
  nature TINYINT NOT NULL DEFAULT 0 COMMENT '企业性质 0:私企 1:国企',
  remarks VARCHAR(300) COMMENT '备注',
  invoice_id BIGINT NOT NULL COMMENT '发票ID',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_name VARCHAR(30) NOT NULL COMMENT '创建人',
  is_enable TINYINT NOT NULL DEFAULT 1 COMMENT '是否有效 0:无效 1:有效',
  PRIMARY KEY (id),
  UNIQUE KEY idx_name (name)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '公司信息表';

-- 创建开票信息表
CREATE TABLE IF NOT EXISTS invoice_information (
  id BIGINT NOT NULL AUTO_INCREMENT COMMENT '开票信息ID',
  name VARCHAR(60) NOT NULL COMMENT '抬头',
  unique_no VARCHAR(18) NOT NULL COMMENT '唯一ID',
  address VARCHAR(300) COMMENT '地址',
  telephone VARCHAR(15) COMMENT '电话',
  open_bank VARCHAR(60) COMMENT '开户银行',
  open_bank_no VARCHAR(20) COMMENT '开户银行卡号',
  remarks VARCHAR(300) COMMENT '备注',
  create_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  create_id BIGINT NOT NULL COMMENT '创建人ID',
  create_name VARCHAR(30) NOT NULL COMMENT '创建人',
  is_enable TINYINT NOT NULL DEFAULT 1 COMMENT '是否有效 0:无效 1:有效',
  PRIMARY KEY (id),
  UNIQUE KEY idx_name (name)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '开票信息表';

-- 创界客户联系人表