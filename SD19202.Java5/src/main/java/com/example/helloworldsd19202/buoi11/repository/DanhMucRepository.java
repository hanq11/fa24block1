package com.example.helloworldsd19202.buoi11.repository;

import com.example.helloworldsd19202.buoi11.entity.DanhMuc;
import com.example.helloworldsd19202.buoi11.entity.DanhMucResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer> {
    @Query("""
        SELECT new com.example.helloworldsd19202.buoi11.entity.DanhMucResponse(
            dm.id,
            dm.ten
        ) FROM DanhMuc dm
    """)
    List<DanhMucResponse> getDanhMucResponse();
}
