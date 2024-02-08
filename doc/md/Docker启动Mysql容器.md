### Docker 启动Mysql 容器

#### 1. 拉取镜像

```BASH
docker pull mysql:8.0.18
```
#### 2.创建文件目录

```bash
mkdir /data/docker/mysql/etc
mkdir /data/docker/mysql/logs
mkdir /data/docker/mysql/data
mkdir /data/docker/mysql/mysql-files

```

#### 3.创建配置文件

vim /data/docker/mysql/etc/my.cnf

```bash
[mysqld]
bind-address=0.0.0.0
port=3306
user=mysql
character_set_server=utf8mb4
collation-server=utf8mb4_general_ci
symbolic-links=0
explicit_defaults_for_timestamp=true
#sql_mode=ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_AUTO_CREATE_USER
max-connections = 1000
max_user_connections = 1000
#innodb_buffer_pool_size=1G
#innodb_buffer_pool_chunk_size=128M
#innodb_buffer_pool_instances=8
#key_buffer_size = 1024M
#sort_buffer_size = 16M
#join_buffer_size = 16M
#read_buffer_size = 4M

[mysql]
default-character-set=utf8mb4

[client]
default-character-set=utf8mb4

```

#### 4.启动容器
```bash
docker run \
--name mysql8 \
-v /data/docker/mysql/conf/my.cnf:/etc/my.cnf \
-v /data/docker/mysql/data:/var/lib/mysql \
-v /data/docker/mysql/log:/var/log \
-v /data/docker/mysql/mysql-files:/var/lib/mysql-files \
-p 3306:3306 \
-e MYSQL_ROOT_PASSWORD='root' \
-d mysql:8.0.29

```

