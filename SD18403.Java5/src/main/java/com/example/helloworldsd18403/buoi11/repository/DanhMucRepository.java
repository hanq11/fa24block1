package com.example.helloworldsd18403.buoi11.repository;

import com.example.helloworldsd18403.buoi11.entity.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer> {
}
