 use furama_management;
 
 -- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
 select  ma_nhan_vien, ho_ten from nhan_vien 
 where ma_nhan_vien not in (
 select nv.ma_nhan_vien from nhan_vien nv
 join hop_dong hd on hd.ma_nhan_vien = nv.ma_nhan_vien
 where nv.ma_nhan_vien in (select hd.ma_nhan_vien from hop_dong hd
 where year(ngay_lam_hop_dong) in (2019,2020,2021))
 group by nv.ma_nhan_vien);
 
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond,
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ

select ma_khach_hang, ho_ten  from khach_hang 
where ma_khach_hang in (select
       ifnull(chi_phi_thue,0) + sum(ifnull(so_luong,0 )* ifnull(gia,0)) as 'tong_tien'
from khach_hang kh
		left join loai_khach lk on kh.ma_loai_khach = lk.ma_loai_khach
        left join hop_dong hd on kh.ma_khach_hang = hd.ma_khach_hang
        left join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
		left join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
        left join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    where hd.ma_hop_dong in ( select ma_hop_dong from hop_dong
    where year(ngay_lam_hop_dong) =2021
   ) 
		group by  kh.ma_khach_hang ,hd.ma_hop_dong);