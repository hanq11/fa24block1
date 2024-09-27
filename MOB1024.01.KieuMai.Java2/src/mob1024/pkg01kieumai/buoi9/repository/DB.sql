/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  syn
 * Created: Sep 27, 2024
 */
CREATE DATABASE MOB102401;
USE MOB102401;

CREATE TABLE sinh_vien (
    id int IDENTITY(1,1) PRIMARY KEY,
    ten nvarchar(50),
    tuoi int,
    diem float,
    gioi_tinh bit
)

INSERT INTO sinh_vien (ten, tuoi, diem, gioi_tinh)
VALUES
    (N'Nguyễn Văn A', 18, 5.4, 0),
    (N'Nguyễn Thị B', 19, 8.4, 1)
SELECT * FROM sinh_vien
