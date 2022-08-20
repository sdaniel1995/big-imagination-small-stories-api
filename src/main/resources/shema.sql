drop if exists Series;

create table Series (
    id serial,
    name text not null,
    primary key  (id)
);