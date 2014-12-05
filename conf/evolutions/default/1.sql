# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table mess (
  author                    varchar(255),
  message                   varchar(255))
;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists mess;

SET REFERENTIAL_INTEGRITY TRUE;

