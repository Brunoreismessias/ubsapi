CREATE TABLE public.basic_health_unit
	(
		id bigint NOT NULL,
		name character varying(30) NOT NULL,
		code integer NOT NULL,
		CONSTRAINT basic_health_unit_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);


CREATE TABLE public.type_street
	(
		id bigint NOT NULL,
		description character varying(10),
		short character(3),
		CONSTRAINT type_street_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.address
	(
		id bigint NOT NULL,
		type_street_id bigint NOT NULL,
		basic_health_unit_id bigint NOT NULL,
		description character varying(40),
		"number" character varying(6),
		district character varying(20),
		complement character varying(30),
		zip_code character varying(8),
		city_id bigint NOT NULL,
		state_id bigint NOT NULL,
		CONSTRAINT address_pk PRIMARY KEY (id)   
	)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.state
	(
		id bigint NOT NULL,
		description character varying(30),
		short character varying(2),
		CONSTRAINT state_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);

    
CREATE TABLE public.city
	(
		id bigint NOT NULL,
		description character varying(30),
		state_id bigint,
		CONSTRAINT city_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.contacts
	(
		id bigint NOT NULL,
		basic_health_unit_id bigint NOT NULL,
		ddd character varying(3),
		phone character varying(8),
		CONSTRAINT contacts_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.geo_code
	(
		id bigint NOT NULL,
		basic_health_unit_id bigint NOT NULL,
		latitude numeric (12, 5) NOT NULL,
		longitude numeric (12, 5) NOT NULL,
		CONSTRAINT geo_code_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);

CREATE TABLE public.scores
	(
		id bigint NOT NULL,
		basic_health_unit_id bigint NOT NULL,
		size integer,
		adaptation_for_seniors integer,
		medical_equipment integer,
		medicine integer,
		CONSTRAINT scores_pk PRIMARY KEY (id)
	)
WITH (
    OIDS = FALSE
);





ALTER TABLE public.basic_health_unit OWNER to postgres;
ALTER TABLE public.type_street OWNER to postgres;
ALTER TABLE public.address OWNER to postgres;
ALTER TABLE public.state OWNER to postgres;
ALTER TABLE public.city OWNER to postgres;
ALTER TABLE public.contacts OWNER to postgres;
ALTER TABLE public.geo_code OWNER to postgres;
ALTER TABLE public.scores OWNER to postgres;
       
    
CREATE SEQUENCE public.basic_health_unit_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.basic_health_unit_seq OWNER TO postgres;
    
       
CREATE SEQUENCE public.type_street_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.type_street_seq OWNER TO postgres;
    
       
CREATE SEQUENCE public.address_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.address_seq OWNER TO postgres;

   
CREATE SEQUENCE public.state_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.state_seq OWNER TO postgres;
    
   
CREATE SEQUENCE public.city_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.city_seq OWNER TO postgres;
    
    
CREATE SEQUENCE public.contacts_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.contacts_seq OWNER TO postgres;


CREATE SEQUENCE public.geo_code_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.geo_code_seq OWNER TO postgres;
    
CREATE SEQUENCE public.scores_seq
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 999999999999;

ALTER SEQUENCE public.scores_seq OWNER TO postgres;
    
    
    
    
    
ALTER TABLE public.address
    ADD CONSTRAINT type_street_fk FOREIGN KEY (type_street_id)
    REFERENCES public.type_street (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;

ALTER TABLE public.address
    ADD CONSTRAINT city_fk FOREIGN KEY (city_id)
    REFERENCES public.city (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;

ALTER TABLE public.address
    ADD CONSTRAINT state_fk FOREIGN KEY (state_id)
    REFERENCES public.state (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;

ALTER TABLE public.address
    ADD CONSTRAINT basic_health_unit_fk FOREIGN KEY (basic_health_unit_id)
    REFERENCES public.basic_health_unit (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;
    
    
ALTER TABLE public.contacts
    ADD CONSTRAINT basic_health_unit_fk FOREIGN KEY (basic_health_unit_id)
    REFERENCES public.basic_health_unit (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;
    
ALTER TABLE public.geo_code
    ADD CONSTRAINT basic_health_unit_fk FOREIGN KEY (basic_health_unit_id)
    REFERENCES public.basic_health_unit (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;
    
    
ALTER TABLE public.scores
    ADD CONSTRAINT basic_health_unit_fk FOREIGN KEY (basic_health_unit_id)
    REFERENCES public.basic_health_unit (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;
    
ALTER TABLE public.city
    ADD CONSTRAINT state_id FOREIGN KEY (state_id)
    REFERENCES public.state (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;
