package com.spring.entities.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entities.model.Address;
import com.spring.entities.model.Entities;
import com.spring.entities.model.Entity;
import com.spring.entities.model.EntityAddr;
import com.spring.entities.util.RestConnector;


@Service
public class EntityService {
	
	@Autowired
	private RestConnector restConnector;

    private static final Map<Integer, Entities> entitiesMap = new HashMap<Integer, Entities>();
    static {
        entitiesMap.put(1, new Entities(1,"10-10-2017", "10-10-2017", "firstname1", "fullName1","init1","language1","languageCd1","legalRefNo1","legalRefNoType1","localeCd1","localeInfoId1","nickname1","osUserLastModified1","personNonPerson1","recordSet1","requestingEntity1","sessUserLastModified1","sex1","surname1","tenantId1","title1",null));
        entitiesMap.put(2, new Entities(2,"10-10-2017", "10-10-2017", "firstname2", "fullName2","init2","language2","languageCd2","legalRefNo2","legalRefNoType2","localeCd2","localeInfoId2","nickname2","osUserLastModified2","personNonPerson2","recordSet2","requestingEntity2","sessUserLastModified2","sex2","surname2","tenantId2","title2",null));
        entitiesMap.put(3, new Entities(3,"10-10-2017", "10-10-2017", "firstname3", "fullName3","init3","language3","languageCd3","legalRefNo3","legalRefNoType3","localeCd3","localeInfoId3","nickname3","osUserLastModified3","personNonPerson3","recordSet3","requestingEntity3","sessUserLastModified3","sex3","surname3","tenantId3","title3",null));
        entitiesMap.put(4, new Entities(4,"10-10-2017", "10-10-2017", "firstname4", "fullName4","init4","language4","languageCd4","legalRefNo4","legalRefNoType4","localeCd4","localeInfoId4","nickname4","osUserLastModified4","personNonPerson4","recordSet4","requestingEntity4","sessUserLastModified4","sex4","surname4","tenantId4","title4",null));
        entitiesMap.put(5, new Entities(5,"10-10-2017", "10-10-2017", "firstname5", "fullName5","init5","language5","languageCd5","legalRefNo5","legalRefNoType5","localeCd5","localeInfoId5","nickname5","osUserLastModified5","personNonPerson5","recordSet5","requestingEntity5","sessUserLastModified5","sex5","surname5","tenantId5","title5",null));
    }

    public Entities getEntityDetails(int id) {
    	if (entitiesMap.containsKey(id)) 
    		return entitiesMap.get(id);
    	else
    		throw new RuntimeException("No Record found.");
    }

    public List<Entities> getAllEntityDetails() {
        List<Entities> entities =  new ArrayList<Entities>();
        entities.addAll(entitiesMap.values());
        return entities;
    }

    public Entities getEntityDetailsWithAddress(int id) {
    	if (entitiesMap.containsKey(id)) {
    		Entities entity = entitiesMap.get(id);
    		EntityAddr entityAddr = restConnector.getEntityAddress(id);
    		List<EntityAddr> entityAddrList = new ArrayList<EntityAddr>();
    		entityAddrList.add(entityAddr);
	        entity.setEntityAddrs(entityAddrList);
	        return entity;
    	}
    	else
    		throw new RuntimeException("No Record found.");
    }

}
