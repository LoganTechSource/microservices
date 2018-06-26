package com.logan.repo.emirepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.logan.repo.emirepo.entity.EMIData;

public interface EMIRepository extends JpaRepository<EMIData, Integer> {
//insert into emi values(1,15000, parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('17-09-2012 18:47:52.69', 'dd-MM-yyyy hh:mm:ss.SS'), 'PAID')
}
