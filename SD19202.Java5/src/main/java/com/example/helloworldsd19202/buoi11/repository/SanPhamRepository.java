package com.example.helloworldsd19202.buoi11.repository;

import com.example.helloworldsd19202.buoi11.entity.SanPham;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    Page<SanPham> findSanPhamsByTenContains(String ten, Pageable pageable);
    // JPQL
    @Query("""
        SELECT sp FROM SanPham sp    
    """)
    List<SanPham> searchJPQL();
    // SQL
    @Query(value = """
        SELECT * FROM SanPham sp WHERE sp.ten = %:ten% ORDER BY sp.gia DESC   
    """, nativeQuery = true)
    List<SanPham> searchSQL(@Param("ten") String ten);
}
