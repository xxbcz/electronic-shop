create table if not exists vacuum_cleaners
(
    id                        bigserial primary key,
    volume_of_vacuum          double precision,
    number_of_modes           int,
    product_type              varchar(100),
    manufacturing_country     varchar(255),
    brand                     varchar(255),
    is_online_order           boolean,
    is_installment_purchasing boolean,
    serial_number             text,
    color                     varchar(100),
    size                      varchar(100),
    price                     double precision,
    in_stock                  boolean,
    model                     varchar(255),
    full_description_type     text
);

create table if not exists personal_computers
(
    id                        bigserial primary key,
    processor_type            varchar(100),
    category                  varchar(100),
    product_type              varchar(100),
    manufacturing_country     varchar(255),
    brand                     varchar(255),
    is_online_order           boolean,
    is_installment_purchasing boolean,
    serial_number             text,
    color                     varchar(100),
    size                      varchar(100),
    price                     double precision,
    in_stock                  boolean,
    model                     varchar(255),
    full_description_type     text
);


create table if not exists tv
(
    id                        bigserial primary key,
    technology                varchar(100),
    category                  varchar(100),
    product_type              varchar(100),
    manufacturing_country     varchar(255),
    brand                     varchar(255),
    is_online_order           boolean,
    is_installment_purchasing boolean,
    serial_number             text,
    color                     varchar(100),
    size                      varchar(100),
    price                     double precision,
    in_stock                  boolean,
    model                     varchar(255),
    full_description_type     text
);

create table if not exists refrigerators
(
    id                        bigserial primary key,
    compressor_type           varchar(100),
    number_of_doors           int,
    product_type              varchar(100),
    manufacturing_country     varchar(255),
    brand                     varchar(255),
    is_online_order           boolean,
    is_installment_purchasing boolean,
    serial_number             text,
    color                     varchar(100),
    size                      varchar(100),
    price                     double precision,
    in_stock                  boolean,
    model                     varchar(255),
    full_description_type     text
);

create table if not exists smartphones
(
    id                        bigserial primary key,
    memory                    int,
    number_of_cameras         int,
    product_type              varchar(100),
    manufacturing_country     varchar(255),
    brand                     varchar(255),
    is_online_order           boolean,
    is_installment_purchasing boolean,
    serial_number             text,
    color                     varchar(100),
    size                      varchar(100),
    price                     double precision,
    in_stock                  boolean,
    model                     varchar(255),
    full_description_type     text
);

insert into personal_computers(processor_type, category, product_type, manufacturing_country, brand,
                               is_online_order, is_installment_purchasing, serial_number, color,
                               size, price, in_stock, model, full_description_type)
VALUES ('desktop', 'системные блоки', 'PERSONAL_COMPUTER', 'China', 'gigabyte', true, true, '274bbbff8',
        'silver', '50x50х20', 99000, false, 'Aorus Extreme', 'персональный компьютер gigabyte Aorus Extreme');
insert into personal_computers(processor_type, category, product_type, manufacturing_country, brand,
                               is_online_order, is_installment_purchasing, serial_number, color,
                               size, price, in_stock, model, full_description_type)
VALUES ('mobile', 'мини пк', 'PERSONAL_COMPUTER', 'China', 'cheap computers', true, false, 'gg54sfd54',
        'black', '25x25х20', 20000, true, 'mini pc', 'персональный компьютер cheap computers mini pc');
insert into personal_computers(processor_type, category, product_type, manufacturing_country, brand,
                               is_online_order, is_installment_purchasing, serial_number, color,
                               size, price, in_stock, model, full_description_type)
VALUES ('desktop', 'игровой компьютер', 'PERSONAL_COMPUTER', 'China', 'amd', false, true, 'gfdfg43',
        'gray', '60x600х30', 199000, false, 'gaming pro', 'персональный компьютер amd gaming pro');

insert into tv (technology, category, product_type, manufacturing_country, brand, is_online_order,
                is_installment_purchasing, serial_number, color, size, price, in_stock
    , model, full_description_type)
values ('ips', 'категория1', 'TV', 'Korea', 'Samsung', true, true, 'f3478fg', 'black',
        '150x200x150', 799000, true, '1JZ-Plazma', 'Телевизор Samsung 1JZ-Plazma');
insert into tv (technology, category, product_type, manufacturing_country, brand, is_online_order,
                is_installment_purchasing, serial_number, color, size, price, in_stock
    , model, full_description_type)
values ('va', 'категория2', 'TV', 'China', 'Xiaomi', true, false, '445633', 'silver',
        '100x140x100', 50000, true, 'Plazma', 'Телевизор Samsung Plazma');
insert into tv (technology, category, product_type, manufacturing_country, brand, is_online_order,
                is_installment_purchasing, serial_number, color, size, price, in_stock
    , model, full_description_type)
values ('oled', 'категория3', 'TV', 'Japan', 'Panasonic', false, true, 'f324322', 'white',
        '130x180x120', 200000, false, '2JZ', 'Телевизор Panasonic 2JZ');

insert into smartphones (memory, number_of_cameras, product_type, manufacturing_country, brand, is_online_order,
                is_installment_purchasing, serial_number, color, size, price, in_stock
    , model, full_description_type)
values (8, 4, 'SMARTPHONE', 'China', 'Xiaomi', true, true, 'f3478fg', 'black',
        '10x5x1', 10000, true, 'ph22', 'Смартфон Xiaomi ph22');
insert into smartphones (memory, number_of_cameras, product_type, manufacturing_country, brand, is_online_order,
                         is_installment_purchasing, serial_number, color, size, price, in_stock
    , model, full_description_type)
values (12, 5, 'SMARTPHONE', 'Japan', 'Samsung', true, true, 'f3dsad', 'white',
        '9x5x1', 20000, false, 'sm55', 'Смартфон Samsung sm55');
insert into smartphones (memory, number_of_cameras, product_type, manufacturing_country, brand, is_online_order,
                         is_installment_purchasing, serial_number, color, size, price, in_stock
    , model, full_description_type)
values (8, 4, 'SMARTPHONE', 'China', 'Apple', true, false, 'f6443', 'black',
        '8x5x1', 100003, true, 'iphone 4', 'Смартфон Apple iphone 4');

insert into vacuum_cleaners (volume_of_vacuum, number_of_modes, product_type, manufacturing_country, brand,
                             is_online_order, is_installment_purchasing, serial_number, color, size, price,
                             in_stock, model, full_description_type)
VALUES (1.9, 10, 'VACUUM_CLEANER', 'China', 'Bosch', true, true, 'r34tgfdg34tsgdf',
        'black', '70x40x35', 7999, true, 'bs-99', 'пылесос Bosch bs-99');
insert into vacuum_cleaners (volume_of_vacuum, number_of_modes, product_type, manufacturing_country, brand,
                             is_online_order, is_installment_purchasing, serial_number, color, size, price,
                             in_stock, model, full_description_type)
VALUES (2.5, 14, 'VACUUM_CLEANER', 'Russia', 'Медведь', false, true, '46f543df534',
        'white', '50x25x30', 4999, true, 'bdc-344', 'пылесос Медведь bdc-344');
insert into vacuum_cleaners (volume_of_vacuum, number_of_modes, product_type, manufacturing_country, brand,
                             is_online_order, is_installment_purchasing, serial_number, color, size, price,
                             in_stock, model, full_description_type)
VALUES (8.0, 29, 'VACUUM_CLEANER', 'Japan', 'Tanuki', true, false, 'hv87ey78owfss',
        'white', '50x25x30', 79999, true, 'yz-335', 'пылесос Tanuki yz-335');

insert into refrigerators (compressor_type, number_of_doors, product_type, manufacturing_country,
                           brand, is_online_order, is_installment_purchasing, serial_number,
                           color, size, price, in_stock, model, full_description_type)
values ('invertor', 2, 'REFRIGERATOR', 'China', 'Friger', false, true, '123456', 'white',
        '230x180x120', 200000, false, 'FR50', 'Холодильник Friger FR50');
insert into refrigerators (compressor_type, number_of_doors, product_type, manufacturing_country,
                           brand, is_online_order, is_installment_purchasing, serial_number,
                           color, size, price, in_stock, model, full_description_type)
values ('default', 1, 'REFRIGERATOR', 'Canada', 'Bosch', false, false, '1234567356', 'white',
        '200x180x120', 150000, false, 'CAN50', 'Холодильник Bosch CAN50');
insert into refrigerators (compressor_type, number_of_doors, product_type, manufacturing_country,
                           brand, is_online_order, is_installment_purchasing, serial_number,
                           color, size, price, in_stock, model, full_description_type)
values ('invertor', 3, 'REFRIGERATOR', 'Russia', 'Atlant', false, true, '64345', 'white',
        '180x60x60', 15000, true, 'AT22', 'Холодильник Atlant AT22');