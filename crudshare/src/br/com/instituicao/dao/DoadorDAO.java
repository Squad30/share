package br.com.instituicao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.instituicao.factory.ConnectionFactory;
import br.com.instituicao.model.Doador;

public class DoadorDAO {
	public void save(Doador doador) {
		String sql = "INSERT INTO Doador (CPF, Nome, Endereco) VALUES (?,?,?)";
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, doador.getCPF());
			pstm.setString(2, doador.getNome());
			pstm.setString(3, doador.getEndereco());
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();

				}
				if (con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	
	public List<Doador> getDoador() throws SQLException{
		String sql = "SELECT * FROM Doador";
		List<Doador> doadores = new ArrayList<Doador>();
			Connection con =null;
			PreparedStatement pstm =null;
			
			ResultSet rset = null;
			
			
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Doador doador = new Doador();
				doador.setCPF(rset.getString("CPF"));
				doador.setEndereco(rset.getString("Endereco"));
				doador.setNome(rset.getString("Nome"));
				doadores.add(doador);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(rset!=null) {
				rset.close();
			}
			if(pstm!=null) {
				pstm.close();
			}
			if(con!=null) {
				con.close();
			}
			
		} catch(Exception e){
				e.printStackTrace();
			}
		}
			return doadores;
			
		}
		
	
	public void update(Doador doador) {
		String sql = "UPDATE doador SET Endereco=?, Nome=? WHERE CPF=?";
		Connection con =null;
		PreparedStatement pstm =null;
		
		try {
			con=ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, doador.getEndereco());
			pstm.setString(2, doador.getNome());
			pstm.setString(3, doador.getCPF());
			pstm.execute();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstm!=null) {
					pstm.close();
				}
				if(con!=null) {
					con.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void deleteByCPF(String CPF) {
		String sql = "DELETE FROM Doador WHERE CPF =?";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, CPF);
			
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			
			if(pstm!=null) {
				pstm.close();
			}
			if(con!=null) {
				con.close();
			}
			
		} catch(Exception e){
				e.printStackTrace();
			}
		}
	}


}
