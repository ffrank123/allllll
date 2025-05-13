package pe.edu.upeu.sysalmacen.mappers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.edu.upeu.sysalmacen.dtos.CategoriaDTO;
import pe.edu.upeu.sysalmacen.dtos.ClienteDTO;
import pe.edu.upeu.sysalmacen.dtos.MarcaDTO;
import pe.edu.upeu.sysalmacen.dtos.ProductoDTO;
import pe.edu.upeu.sysalmacen.dtos.UnidadMedidaDTO;
import pe.edu.upeu.sysalmacen.dtos.UsuarioDTO;
import pe.edu.upeu.sysalmacen.dtos.VentaDTO;
import pe.edu.upeu.sysalmacen.dtos.VentaDetalleDTO;
import pe.edu.upeu.sysalmacen.modelo.Categoria;
import pe.edu.upeu.sysalmacen.modelo.Cliente;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.modelo.Producto;
import pe.edu.upeu.sysalmacen.modelo.UnidadMedida;
import pe.edu.upeu.sysalmacen.modelo.Usuario;
import pe.edu.upeu.sysalmacen.modelo.Venta;
import pe.edu.upeu.sysalmacen.modelo.VentaDetalle;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-13T17:20:40-0500",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.14 (Oracle Corporation)"
)
@Component
public class VentaMapperImpl implements VentaMapper {

    @Override
    public VentaDTO toDTO(Venta entity) {
        if ( entity == null ) {
            return null;
        }

        VentaDTO ventaDTO = new VentaDTO();

        ventaDTO.setIdVenta( entity.getIdVenta() );
        ventaDTO.setPrecioBase( entity.getPrecioBase() );
        ventaDTO.setIgv( entity.getIgv() );
        ventaDTO.setPrecioTotal( entity.getPrecioTotal() );
        ventaDTO.setCliente( clienteToClienteDTO( entity.getCliente() ) );
        ventaDTO.setUsuario( usuarioToUsuarioDTO( entity.getUsuario() ) );
        ventaDTO.setNumDoc( entity.getNumDoc() );
        ventaDTO.setFechaGener( entity.getFechaGener() );
        ventaDTO.setSerie( entity.getSerie() );
        ventaDTO.setTipoDoc( entity.getTipoDoc() );
        ventaDTO.setVentaDetalles( ventaDetalleListToVentaDetalleDTOList( entity.getVentaDetalles() ) );

        return ventaDTO;
    }

    @Override
    public Venta toEntity(VentaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Venta.VentaBuilder venta = Venta.builder();

        venta.idVenta( dto.getIdVenta() );
        venta.precioBase( dto.getPrecioBase() );
        venta.igv( dto.getIgv() );
        venta.precioTotal( dto.getPrecioTotal() );
        venta.cliente( clienteDTOToCliente( dto.getCliente() ) );
        venta.usuario( usuarioDTOToUsuario( dto.getUsuario() ) );
        venta.numDoc( dto.getNumDoc() );
        venta.fechaGener( dto.getFechaGener() );
        venta.serie( dto.getSerie() );
        venta.tipoDoc( dto.getTipoDoc() );
        venta.ventaDetalles( ventaDetalleDTOListToVentaDetalleList( dto.getVentaDetalles() ) );

        return venta.build();
    }

    @Override
    public List<VentaDTO> toDTOs(List<Venta> entities) {
        if ( entities == null ) {
            return null;
        }

        List<VentaDTO> list = new ArrayList<VentaDTO>( entities.size() );
        for ( Venta venta : entities ) {
            list.add( toDTO( venta ) );
        }

        return list;
    }

    @Override
    public List<Venta> toEntities(List<VentaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Venta> list = new ArrayList<Venta>( dtos.size() );
        for ( VentaDTO ventaDTO : dtos ) {
            list.add( toEntity( ventaDTO ) );
        }

        return list;
    }

    @Override
    public Venta toEntityFromCADTO(VentaDTO.VentaCADTO ventaCADTO) {
        if ( ventaCADTO == null ) {
            return null;
        }

        Venta.VentaBuilder venta = Venta.builder();

        venta.idVenta( ventaCADTO.idVenta() );
        venta.precioBase( ventaCADTO.precioBase() );
        venta.igv( ventaCADTO.igv() );
        venta.precioTotal( ventaCADTO.precioTotal() );
        venta.numDoc( ventaCADTO.numDoc() );
        venta.fechaGener( ventaCADTO.fechaGener() );
        venta.serie( ventaCADTO.serie() );
        venta.tipoDoc( ventaCADTO.tipoDoc() );

        return venta.build();
    }

    protected ClienteDTO clienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setDniruc( cliente.getDniruc() );
        clienteDTO.setNombres( cliente.getNombres() );
        clienteDTO.setRepLegal( cliente.getRepLegal() );
        clienteDTO.setTipoDocumento( cliente.getTipoDocumento() );
        clienteDTO.setDireccion( cliente.getDireccion() );

        return clienteDTO;
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

    protected VentaDetalleDTO ventaDetalleToVentaDetalleDTO(VentaDetalle ventaDetalle) {
        if ( ventaDetalle == null ) {
            return null;
        }

        VentaDetalleDTO ventaDetalleDTO = new VentaDetalleDTO();

        ventaDetalleDTO.setIdVentaDetalle( ventaDetalle.getIdVentaDetalle() );
        ventaDetalleDTO.setPu( ventaDetalle.getPu() );
        ventaDetalleDTO.setCantidad( ventaDetalle.getCantidad() );
        ventaDetalleDTO.setDescuento( ventaDetalle.getDescuento() );
        ventaDetalleDTO.setSubtotal( ventaDetalle.getSubtotal() );
        ventaDetalleDTO.setVenta( toDTO( ventaDetalle.getVenta() ) );
        ventaDetalleDTO.setProducto( productoToProductoDTO( ventaDetalle.getProducto() ) );

        return ventaDetalleDTO;
    }

    protected List<VentaDetalleDTO> ventaDetalleListToVentaDetalleDTOList(List<VentaDetalle> list) {
        if ( list == null ) {
            return null;
        }

        List<VentaDetalleDTO> list1 = new ArrayList<VentaDetalleDTO>( list.size() );
        for ( VentaDetalle ventaDetalle : list ) {
            list1.add( ventaDetalleToVentaDetalleDTO( ventaDetalle ) );
        }

        return list1;
    }

    protected Cliente clienteDTOToCliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente.ClienteBuilder cliente = Cliente.builder();

        cliente.dniruc( clienteDTO.getDniruc() );
        cliente.nombres( clienteDTO.getNombres() );
        cliente.repLegal( clienteDTO.getRepLegal() );
        cliente.tipoDocumento( clienteDTO.getTipoDocumento() );
        cliente.direccion( clienteDTO.getDireccion() );

        return cliente.build();
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

    protected VentaDetalle ventaDetalleDTOToVentaDetalle(VentaDetalleDTO ventaDetalleDTO) {
        if ( ventaDetalleDTO == null ) {
            return null;
        }

        VentaDetalle.VentaDetalleBuilder ventaDetalle = VentaDetalle.builder();

        ventaDetalle.idVentaDetalle( ventaDetalleDTO.getIdVentaDetalle() );
        ventaDetalle.pu( ventaDetalleDTO.getPu() );
        ventaDetalle.cantidad( ventaDetalleDTO.getCantidad() );
        ventaDetalle.descuento( ventaDetalleDTO.getDescuento() );
        ventaDetalle.subtotal( ventaDetalleDTO.getSubtotal() );
        ventaDetalle.venta( toEntity( ventaDetalleDTO.getVenta() ) );
        ventaDetalle.producto( productoDTOToProducto( ventaDetalleDTO.getProducto() ) );

        return ventaDetalle.build();
    }

    protected List<VentaDetalle> ventaDetalleDTOListToVentaDetalleList(List<VentaDetalleDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<VentaDetalle> list1 = new ArrayList<VentaDetalle>( list.size() );
        for ( VentaDetalleDTO ventaDetalleDTO : list ) {
            list1.add( ventaDetalleDTOToVentaDetalle( ventaDetalleDTO ) );
        }

        return list1;
    }
}
