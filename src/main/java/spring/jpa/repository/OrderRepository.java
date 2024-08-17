package spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.jpa.entity.OrderEntity;


@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Integer> {
}
