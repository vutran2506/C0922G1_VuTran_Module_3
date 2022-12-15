create
database if not exists wasehouse_management;
use
wasehouse_management;

create table phieu_xuat
(
    so_phieu_xuat int auto_increment primary key,
    ngay_xuat     datetime
);

create table vat_tu
(
    ma_vat_tu  int auto_increment primary key,
    ten_vat_tu varchar(30)
);

create table chi_tiet_phieu_xuat
(
    so_phieu_xuat int,
    ma_vat_tu     int,
    don_gia_xuat  double,
    so_luong_xuat int,
    foreign key (so_phieu_xuat) references phieu_xuat (so_phieu_xuat),
    foreign key (ma_vat_tu) references vat_tu (ma_vat_tu)
);

create table phieu_nhap
(
    so_phieu_nhap int auto_increment primary key,
    ngay_nhap     datetime
);

create table chi_tiet_phieu_nhap
(
    ma_vat_tu     int,
    so_phieu_nhap int,
    don_gia_nhap  double,
    so_luong_nhap int,
    foreign key (ma_vat_tu) references vat_tu (ma_vat_tu),
    foreign key (so_phieu_nhap) references phieu_nhap (so_phieu_nhap)
);

create table nha_cung_cap
(
    ma_nha_cung_cap  int auto_increment primary key,
    ten_nha_cung_cap varchar(50),
    dia_chi          varchar(50)
);

create table so_dien_thoai
(
    ma_nha_cung_cap   int,
    ten_so_dien_thoai varchar(30),
    foreign key (ma_nha_cung_cap) references nha_cung_cap (ma_nha_cung_cap)
);

create table don_dat_hang
(
    so_don_dat_hang int auto_increment primary key,
    ngay_dat_hang   datetime
);

create table cung_cap
(
    so_don_dat_hang int,
    ma_nha_cung_cap int,
    foreign key (so_don_dat_hang) references don_dat_hang (so_don_dat_hang),
    foreign key (ma_nha_cung_cap) references nha_cung_cap (ma_nha_cung_cap)
);

create table chi_tiet_don_dat_hang
(
    ma_vat_tu       int,
    so_don_dat_hang int,
    foreign key (ma_vat_tu) references vat_tu (ma_vat_tu),
    foreign key (so_don_dat_hang) references don_dat_hang (so_don_dat_hang)
);




