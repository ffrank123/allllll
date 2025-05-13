package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.dtos.MarcaDTO;
import pe.edu.upeu.sysalmacen.dtos.ProductoDTO;
import pe.edu.upeu.sysalmacen.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysalmacen.modelo.Categoria;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.modelo.Producto;
import pe.edu.upeu.sysalmacen.modelo.UnidadMedida;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-13T17:20:40-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.14 (Oracle Corporation)"
)
@Component
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoDTO toDTO(Producto entity) {
        if ( entity == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setIdProducto( entity.getIdProducto() );
        productoDTO.setNombre( entity.getNombre() );
        productoDTO.setPu( entity.getPu() );
        productoDTO.setPuOld( entity.getPuOld() );
        productoDTO.setUtilidad( entity.getUtilidad() );
        productoDTO.setStock( entity.getStock() );
        productoDTO.setStockOld( entity.getStockOld() );
        productoDTO.setCategoria( categoriaToCategoriaDTO( entity.getCategoria() ) );
        productoDTO.setMarca( marcaToMarcaDTO( entity.getMarca() ) );
        productoDTO.setUnidadMedida( unidadMedidaToUnidadMedidaDTO( entity.getUnidadMedida() ) );

        return productoDTO;
    }

    @Override
    public Producto toEntity(ProductoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Producto.ProductoBuilder producto = Producto.builder();

        producto.idProducto( dto.getIdProducto() );
        producto.nombre( dto.getNombre() );
        producto.pu( dto.getPu() );
        producto.puOld( dto.getPuOld() );
        producto.utilidad( dto.getUtilidad() );
        producto.stock( dto.getStock() );
        producto.stockOld( dto.getStockOld() );
        producto.categoria( categoriaDTOToCategoria( dto.getCategoria() ) );
        producto.marca( marcaDTOToMarca( dto.getMarca() ) );
        producto.unidadMedida( unidadMedidaDTOToUnidadMedida( dto.getUnidadMedida() ) );

        return producto.build();
    }

    @Override
    public List<ProductoDTO> toDTOs(List<Producto> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ProductoDTO> list = new ArrayList<ProductoDTO>( entities.size() );
        for ( Producto producto : entities ) {
            list.add( toDTO( producto ) );
        }

        return list;
    }

    @Override
    public List<Producto> toEntities(List<ProductoDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Producto> list = new ArrayList<Producto>( dtos.size() );
        for ( ProductoDTO productoDTO : dtos ) {
            list.add( toEntity( productoDTO ) );
        }

        return list;
    }

    @Override
    public Producto toEntityFromCADTO(ProductoDTO.ProductoCADto productoCrearDTO) {
        if ( productoCrearDTO == null ) {
            return null;
        }

        Producto.ProductoBuilder producto = Producto.builder();

        producto.idProducto( productoCrearDTO.idProducto() );
        producto.nombre( productoCrearDTO.nombre() );
        producto.pu( productoCrearDTO.pu() );
        producto.puOld( productoCrearDTO.puOld() );
        producto.utilidad( productoCrearDTO.utilidad() );
        producto.stock( productoCrearDTO.stock() );
        producto.stockOld( productoCrearDTO.stockOld() );

        return producto.build();
    }

    protected CategoriaDTO categoriaToCategoriaDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        CategoriaDTO categoriaDTO = new CategoriaDTO();

        categoriaDTO.setIdCategoria( categoria.getIdCategoria() );
        categoriaDTO.setNombre( categoria.getNombre() );

        return categoriaDTO;
    }

    protected MarcaDTO marcaToMarcaDTO(Marca marca) {
        if ( marca == null ) {
            return null;
        }

        MarcaDTO.MarcaDTOBuilder marcaDTO = MarcaDTO.builder();

        marcaDTO.idMarca( marca.getIdMarca() );
        marcaDTO.nombre( marca.getNombre() );

        return marcaDTO.build();
    }

    protected UnidadMedidaDTO unidadMedidaToUnidadMedidaDTO(UnidadMedida unidadMedida) {
        if ( unidadMedida == null ) {
            return null;
        }

        UnidadMedidaDTO unidadMedidaDTO = new UnidadMedidaDTO();

        unidadMedidaDTO.setIdUnidad( unidadMedida.getIdUnidad() );
        unidadMedidaDTO.setNombreMedida( unidadMedida.getNombreMedida() );

        return unidadMedidaDTO;
    }

    protected Categoria categoriaDTOToCategoria(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria.CategoriaBuilder categoria = Categoria.builder();

        categoria.idCategoria( categoriaDTO.getIdCategoria() );
        categoria.nombre( categoriaDTO.getNombre() );

        return categoria.build();
    }

    protected Marca marcaDTOToMarca(MarcaDTO marcaDTO) {
        if ( marcaDTO == null ) {
            return null;
        }

        Marca.MarcaBuilder marca = Marca.builder();

        marca.idMarca( marcaDTO.getIdMarca() );
        marca.nombre( marcaDTO.getNombre() );

        return marca.build();
    }

    protected UnidadMedida unidadMedidaDTOToUnidadMedida(UnidadMedidaDTO unidadMedidaDTO) {
        if ( unidadMedidaDTO == null ) {
            return null;
        }

        UnidadMedida.UnidadMedidaBuilder unidadMedida = UnidadMedida.builder();

        unidadMedida.idUnidad( unidadMedidaDTO.getIdUnidad() );
        unidadMedida.nombreMedida( unidadMedidaDTO.getNombreMedida() );

        return unidadMedida.build();
    }
}
