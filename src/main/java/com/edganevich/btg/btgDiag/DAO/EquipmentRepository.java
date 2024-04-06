package com.edganevich.btg.btgDiag.DAO;


import com.edganevich.btg.btgDiag.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

    Equipment findEquipmentById(Integer id);



}
