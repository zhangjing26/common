USE blog;

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名称',
  `description` varchar(128) NOT NULL DEFAULT '' COMMENT '用户描述',
  `user_password` varchar(32) NOT NULL DEFAULT '' COMMENT '用户秘密',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '删除标记',
  `deleted_at` timestamp NOT NULL DEFAULT '1970-01-01 08:00:01' COMMENT '删除时间',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息';

