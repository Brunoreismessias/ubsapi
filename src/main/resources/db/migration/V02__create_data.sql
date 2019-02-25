INSERT INTO public.province (id, description, short) VALUES(nextval('province_seq'), 'SÃO PAULO', 'SP');
INSERT INTO public.province (id, description, short) VALUES(nextval('province_seq'), 'RIO DE JANEIRO', 'RJ');
INSERT INTO public.province (id, description, short) VALUES(nextval('province_seq'), 'BAHIA', 'BA');

INSERT INTO public.type_street (id, description, short) VALUES(nextval('type_street_seq'), 'AVENIDA', 'AV');
INSERT INTO public.type_street (id, description, short) VALUES(nextval('type_street_seq'), 'RUA', 'RUA');
INSERT INTO public.type_street (id, description, short) VALUES(nextval('type_street_seq'), 'LARGO', 'LGO');

INSERT INTO public.city (id, description, province_id) VALUES(nextval('city_seq'), 'SÃO PAULO', (select id from public.province where short = 'SP'));
INSERT INTO public.city (id, description, province_id) VALUES(nextval('city_seq'), 'SÃO BERNRDO DO CAMPO', (select id from public.province where short = 'SP'));
INSERT INTO public.city (id, description, province_id) VALUES(nextval('city_seq'), 'TABOÃO DA SERRA', (select id from public.province where short = 'SP'));
INSERT INTO public.city (id, description, province_id) VALUES(nextval('city_seq'), 'SALVADOR', (select id from public.province where short = 'BA'));

INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Jardim Europa', 1);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Cidade Jardim', 2);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Morumbi', 3);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Itaim Bibi', 4);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Chacara Santana', 5);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Bronklin', 6);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Campo Limpo', 7);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Santo Amaro', 8);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Jardim Paulista', 9);
INSERT INTO public.basic_health_unit (id, "name", code) VALUES(nextval('basic_health_unit_seq'), 'UBS Moema', 10);


INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 1), '011', '41578456');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 2), '011', '41578922');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 3), '011', '41578989');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 4), '011', '41578966');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 5), '011', '41578645');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 6), '011', '41575945');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 7), '011', '41576945');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 8), '011', '41573945');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 9), '011', '41578645');
INSERT INTO public.contacts (id, basic_health_unit_id, ddd, phone) VALUES(nextval('contacts_seq'), (select id from public.basic_health_unit where code = 10), '011', '41578955');


INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 1),
'PASCAL', '1382', 'Jardim Europa', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 2),
'RODOVIARIOS', '5382', 'Cidade Jardim', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 3),
'GREGORIO', '1000', 'Morumbi', '', '40100000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 4),
'CAMINHO DAS ARVORES', '82', 'Itaim Bibi', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 5),
'ALEXANDRE DUMAS', '14A', 'Chacara Santana', '', '40560000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 6),
'DOS ARTISTAS', '555', 'Bronklin', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'AV'), (select id from public.basic_health_unit where code = 7),
'CAMINHO', '2', 'Campo Limpo', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'LGO'), (select id from public.basic_health_unit where code = 8),
'TREZE', 'SN', 'Santo Amaro', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'RUA'), (select id from public.basic_health_unit where code = 9),
'PASCAL', '1382', 'Jardim Paulista', '', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));

INSERT INTO public.address(id, type_street_id, basic_health_unit_id, description, "number", district, complement, zip_code, city_id, province_id)
VALUES(nextval('address_seq'), (select id from type_street where short = 'RUA'), (select id from public.basic_health_unit where code = 10),
'DOUTOR CARDOSO', '77', 'Moema', '2° Andar', '40000000', (select id from city where description = 'SÃO PAULO'), (select id from public.province where short = 'SP'));



INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 1), 50.18, 50.20);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 2), 50.12, 51.17);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 3), 50.13, 53,27);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 4), 50.33, 50.13);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 5), 50.17, 50.10);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 6), 34.55, 67.90);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 7), 34.38, 89.5);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 8), 34.33, 45.5);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 9), 5.37, 56.5);

INSERT INTO public.geo_code (id, basic_health_unit_id, latitude, longitude)
VALUES(nextval('geo_code_seq'), (select id from public.basic_health_unit where code = 10), 5.40, 5.89);


INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 1), 1, 1, 1, 1);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 2), 3, 3, 3, 2);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 3), 1, 3, 3, 3);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 4), 2, 3, 1, 3);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 5), 1, 1, 1, 1);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 6), 1, 1, 3, 2);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 7), 1, 1, 2, 3);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 8), 3, 1, 3, 3);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 9), 1, 3, 3, 3);

INSERT INTO public.scores (id, basic_health_unit_id, "size", adaptation_for_seniors, medical_equipment, medicine)
VALUES(nextval('scores_seq'), (select id from public.basic_health_unit where code = 10), 1, 2, 3, 3);
