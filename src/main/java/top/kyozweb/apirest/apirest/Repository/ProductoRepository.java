package top.kyozweb.apirest.apirest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import top.kyozweb.apirest.apirest.Entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
