insert into un.region (code, name) values (142,'Asia');
insert into un.region (code, name) values (150,'Europe');
insert into un.region (code, name) values (2,'Africa');
insert into un.region (code, name) values (9,'Oceania');
insert into un.region (code, name) values (19,'Americas');

insert into un.land_locked_developed_countries (is_land_locked_developing_country) values (true);
insert into un.land_locked_developed_countries (is_land_locked_developing_country) values (false);

insert into un.least_developed_countries (is_least_developed_country) values (true);
insert into un.least_developed_countries (is_least_developed_country) values (false);

insert into un.small_island_developing_states (is_small_island_developing) values (true);
insert into un.small_island_developing_states (is_small_island_developing) values (false);

insert into un.developing_status (is_developed) values (true);
insert into un.developing_status (is_developed) values (false);

insert into un.sub_region (code, name, region_code) values (15,'Northern Africa', 2);
insert into un.sub_region (code, name, region_code) values (21,'Northern America', 19);
insert into un.sub_region (code, name, region_code) values (30,'Eastern Asia', 142);
insert into un.sub_region (code, name, region_code) values (34,'Southern Asia', 142);
insert into un.sub_region (code, name, region_code) values (35,'South-eastern Asia', 142);
insert into un.sub_region (code, name, region_code) values (39,'Southern Europe', 150);
insert into un.sub_region (code, name, region_code) values (53,'Australia and New Zealand', 9);
insert into un.sub_region (code, name, region_code) values (54,'Melanesia', 9);
insert into un.sub_region (code, name, region_code) values (57,'Micronesia', 9);
insert into un.sub_region (code, name, region_code) values (61,'Polynesia', 9);
insert into un.sub_region (code, name, region_code) values (143,'Central Asia', 142);
insert into un.sub_region (code, name, region_code) values (145,'Western Asia', 142);
insert into un.sub_region (code, name, region_code) values (151,'Eastern Europe', 150);
insert into un.sub_region (code, name, region_code) values (154,'Northern Europe', 150);
insert into un.sub_region (code, name, region_code) values (155,'Western Europe', 150);
insert into un.sub_region (code, name, region_code) values (202,'Sub-Saharan Africa', 2);
insert into un.sub_region (code, name, region_code) values (419,'Latin America and the Caribbean', 19);
