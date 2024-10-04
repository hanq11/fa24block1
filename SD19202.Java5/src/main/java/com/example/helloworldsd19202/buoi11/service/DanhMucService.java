package com.example.helloworldsd19202.buoi11.service;

import com.example.helloworldsd19202.buoi11.entity.DanhMuc;
import com.example.helloworldsd19202.buoi11.repository.DanhMucRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanhMucService {
    @Autowired
    DanhMucRepository danhMucRepository;

    public List<DanhMuc> getAll() {
        return danhMucRepository.findAll();
    }

    public void them(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
    }

    public void sua(DanhMuc danhMuc) {
        danhMucRepository.save(danhMuc);
    }

    public void xoa(Integer id) {
        danhMucRepository.deleteById(id);
    }

    public DanhMuc findById(Integer id) {
        return danhMucRepository.findById(id).get();
    }
}
