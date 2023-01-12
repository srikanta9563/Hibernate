package com.vehicle.daoimpl;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.vehicle.config.HibernateUtil;
import com.vehicle.dao.Dao;
import com.vehicle.entity.FourWheels;
import com.vehicle.entity.TwoWheels;

public class DaoImpl{
public void addVehicle() {
	Session session  = HibernateUtil.activeSession();
	Transaction t = session.beginTransaction();
	
	TwoWheels tw = new TwoWheels();
	tw.setFuel("petrol");
	tw.setEnginepower("500cc");
	tw.setSpeed(200);
	tw.setVtype("Bike");
	tw.setPrice(200000);
	tw.setModelno(1234);
	tw.setModelname("abc");
	tw.setAbs(true);
	tw.setTyretype(140);
	tw.setBtype("sports bike");
	
	FourWheels fw = new FourWheels();
	fw.setFuel("electric");
	fw.setEnginepower("1000cc");
	fw.setSpeed(400);
	fw.setVtype("Car");
	fw.setPrice(800000);
	fw.setModelno(12345);
	fw.setModelname("swift");
	fw.setMusicSystem(true);
	fw.setEtype("auto");
	fw.setAc(true);
	
	session.save(tw);
	session.save(fw);
	
	t.commit();
	System.out.println("joining done");
}
}