package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.dtos.MarcaDTO;
import pe.edu.upeu.sysalmacen.dtos.ProductoDTO;
import pe.edu.upeu.sysalmacen.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysalmacen.dtos.UsuarioDTO;
import pe.edu.upeu.sysalmacen.dtos.VentCarritoDTO;
import pe.edu.upeu.sysalmacen.modelo.Categoria;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.modelo.Producto;
import pe.edu.upeu.sysalmacen.modelo.UnidadMedida;
import pe.edu.upeu.sysalmacen.modelo.Usuario;
import pe.edu.upeu.sysalmacen.modelo.VentCarrito;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-13T17:20:40-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.14 (Oracle Corporation)"
)
@Component
public class VentCarritoMapperImpl implements VentCarritoMapper {

    @Override
    public VentCarritoDTO toDTO(VentCarrito entity) {
        if ( entity == null ) {
            return null;
        }

        VentCarritoDTO ventCarritoDTO = new VentCarritoDTO();

        ventCarritoDTO.setIdCarrito( entity.getIdCarrito() );
        ventCarritoDTO.setDniruc( entity.getDniruc() );
        ventCarritoDTO.setProducto( productoToProductoDTO( entity.getProducto() ) );
        ventCarritoDTO.setNombreProducto( entity.getNombreProducto() );
        ventCarritoDTO.setCantidad( entity.getCantidad() );
        ventCarritoDTO.setPunitario( entity.getPunitario() );
        ventCarritoDTO.setPtotal( entity.getPtotal() );
        ventCarritoDTO.setEstado( entity.getEstado() );
        ventCarritoDTO.setUsuario( usuarioToUsuarioDTO( entity.getUsuario() ) );

        return ventCarritoDTO;
    }

    @Override
    public VentCarrito toEntity(VentCarritoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VentCarrito.VentCarritoBuilder ventCarrito = VentCarrito.builder();

        ventCarrito.idCarrito( dto.getIdCarrito() );
        ventCarrito.dniruc( dto.getDniruc() );
        ventCarrito.producto( productoDTOToProducto( dto.getProducto() ) );
        ventCarrito.nombreProducto( dto.getNombreProducto() );
        ventCarrito.cantidad( dto.getCantidad() );
        ventCarrito.punitario( dto.getPunitario() );
        ventCarrito.ptotal( dto.getPtotal() );
        ventCarrito.estado( dto.getEstado() );
        ventCarrito.usuario( usuarioDTOToUsuario( dto.getUsuario() ) );

        return ventCarrito.build();
    }

    @Override
    public List<VentCarritoDTO> toDTOs(List<VentCarrito> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VentCarritoDTO> list = new ArrayList<VentCarritoDTO>( entities.size() );
        for ( VentCarrito ventCarrito : entities ) {
            list.add( toDTO( ventCarrito ) );
        }

        return list;
    }

    @Override
    public List<VentCarrito> toEntities(List<VentCarritoDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<VentCarrito> list = new ArrayList<VentCarrito>( dtos.size() );
        for ( VentCarritoDTO ventCarritoDTO : dtos ) {
            list.add( toEntity( ventCarritoDTO ) );
        }

        return list;
    }

    @Override
    public VentCarrito toEntityFromCADTO(VentCarritoDTO.VentCarritoCADTO ventCarritoCrearDTO) {
        if ( ventCarritoCrearDTO == null ) {
            return null;
        }

        VentCarrito.VentCarritoBuilder ventCarrito = VentCarrito.builder();

        ventCarrito.idCarrito( ventCarritoCrearDTO.idCarrito() );
        ventCarrito.dniruc( ventCarritoCrearDTO.dniruc() );
        ventCarrito.nombreProducto( ventCarritoCrearDTO.nombreProducto() );
        ventCarrito.cantidad( ventCarritoCrearDTO.cantidad() );
        ventCarrito.punitario( ventCarritoCrearDTO.punitario() );
        ventCarrito.ptotal( ventCarritoCrearDTO.ptotal() );
        ventCarrito.estado( ventCarritoCrearDTO.estado() );

        return ventCarrito.build();
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

    protected ProductoDTO productoToProductoDTO(Producto producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setIdProducto( producto.getIdProducto() );
        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setPu( producto.getPu() );
        productoDTO.setPuOld( producto.getPuOld() );
        productoDTO.setUtilidad( producto.getUtilidad() );
        productoDTO.setStock( producto.getStock() );
        productoDTO.setStockOld( producto.getStockOld() );
        productoDTO.setCategoria( categoriaToCategoriaDTO( producto.getCategoria() ) );
        productoDTO.setMarca( marcaToMarcaDTO( producto.getMarca() ) );
        productoDTO.setUnidadMedida( unidadMedidaToUnidadMedidaDTO( producto.getUnidadMedida() ) );

        return productoDTO;
    }

    protected UsuarioDTO usuarioToUsuarioDTO(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDTO usuarioDTO = new UsuarioDTO();

        usuarioDTO.setIdUsuario( usuario.getIdUsuario() );
        usuarioDTO.setUser( usuario.getUser() );
        usuarioDTO.setEstado( usuario.getEstado() );

        return usuarioDTO;
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

    protected Producto productoDTOToProducto(ProductoDTO productoDTO) {
        if ( productoDTO == null ) {
            return null;
        }

        Producto.ProductoBuilder producto = Producto.builder();

        producto.idProducto( productoDTO.getIdProducto() );
        producto.nombre( productoDTO.getNombre() );
        producto.pu( productoDTO.getPu() );
        producto.puOld( productoDTO.getPuOld() );
        producto.utilidad( productoDTO.getUtilidad() );
        producto.stock( productoDTO.getStock() );
        producto.stockOld( productoDTO.getStockOld() );
        producto.categoria( categoriaDTOToCategoria( productoDTO.getCategoria() ) );
        producto.marca( marcaDTOToMarca( productoDTO.getMarca() ) );
        producto.unidadMedida( unidadMedidaDTOToUnidadMedida( productoDTO.getUnidadMedida() ) );

        return producto.build();
    }

    protected Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO) {
        if ( usuarioDTO == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.idUsuario( usuarioDTO.getIdUsuario() );
        usuario.user( usuarioDTO.getUser() );
        usuario.estado( usuarioDTO.getEstado() );

        return usuario.build();
    }
}
