/**
 * 
 */
package ps.warehouseService.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ps.warehouseService.model.Item;
import ps.warehouseService.model.Warehouse;
import ps.warehouseService.service.orchestration.WarehouseService;

/**
 * @author Rami
 *
 */
@RestController
@RequestMapping("/warehouseDetails")
public class WarehouseServiceController {
	
	final static Logger logger = Logger.getLogger(WarehouseServiceController.class);
	
	@Autowired
	private WarehouseService warehouseService;
	
	/**
	 * Get all warehouseService with details
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Warehouse>> getAllwarehouseServiceWithDetails() {
		logger.info("---------------warehouseService------------");
		List<Warehouse> warehouseServiceList = warehouseService.getAllwarehouseServiceWithDetails();
		
		return new ResponseEntity<List<Warehouse>>(warehouseServiceList, HttpStatus.OK);		
	}
	
	/**
	 * Get item details
	 * @return
	 */
	@RequestMapping(value = "/{itemId}",
		method = RequestMethod.GET)
	public ResponseEntity<Item> checkExistence(@PathVariable("itemId") String itemId) {
		logger.info("--------------checkExistence-------------");
		Item item = warehouseService.checkExistence(itemId);
		if (item == null) {
			return new ResponseEntity<Item>(item, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Item>(item, HttpStatus.OK);		
	}

	
}
