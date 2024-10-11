package com.example.helloworldsd18403.buoi11.repository;

import com.example.helloworldsd18403.buoi11.entity.SanPham;
import com.example.helloworldsd18403.buoi11.entity.SanPhamResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    Page<SanPham> findSanPhamsByTenContains(String ten, Pageable pageable);

    @Query("""
        SELECT new com.example.helloworldsd18403.buoi11.entity.SanPhamResponse(
            sp.id,
            sp.ten,
            sp.gia,
            sp.ngayTao,
            sp.danhMuc.id,
            sp.danhMuc.ten
        ) FROM SanPham sp
        """)
    List<SanPhamResponse> test();
}
