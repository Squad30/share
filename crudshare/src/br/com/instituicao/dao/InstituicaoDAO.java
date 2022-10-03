package br.com.instituicao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.instituicao.factory.ConnectionFactory;
import br.com.instituicao.model.Instituicao;

public class InstituicaoDAO {
	public void save(Instituicao instituicao) {
		String sql = "INSERT INTO Instituicao (Nome, Endereco, CEP, Oficio, CNPJ) VALUES (?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, instituicao.getNome());
			pstm.setString(2, instituicao.getEndereco());
			pstm.setString(3, instituicao.getCEP());
			pstm.setString(4, instituicao.getOficio());
			pstm.setString(5, instituicao.getCNPJ());
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

	
	public List<Instituicao> getInstituicao() throws SQLException{
		String sql = "SELECT * FROM Instituicao";
		List<Instituicao> instituicoes = new ArrayList<Instituicao>();
			Connection con =null;
			PreparedStatement pstm =null;
			
			ResultSet rset = null;
			
			
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Instituicao instituicao = new Instituicao();
				instituicao.setNome(rset.getString("Nome"));
				instituicao.setEndereco(rset.getString("Endereco"));
				instituicao.setCEP(rset.getString("CEP"));
				instituicao.setOficio(rset.getString("Oficio"));
				instituicao.setCNPJ(rset.getString("CNPJ"));
				instituicoes.add(instituicao);
				
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
			return instituicoes;
			
		}
		
	
	public void update(Instituicao instituicao) {
		String sql = "UPDATE Instituicao SET Nome=?, Endereco=?, CEP=?, Oficio=? WHERE CNPJ=?";
		Connection con =null;
		PreparedStatement pstm =null;
		
		try {
			con=ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, instituicao.getNome());
			pstm.setString(2, instituicao.getEndereco());
			pstm.setString(3, instituicao.getCEP());
			pstm.setString(4, instituicao.getOficio());
			pstm.setString(5, instituicao.getCNPJ());
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
	public void deleteByCNPJ(String CNPJ) {
		String sql = "DELETE FROM Instituicao WHERE CNPJ =?";
		Connection con = null;
		PreparedStatement pstm = null;
		
		try {
			con = ConnectionFactory.createConnectionToMySQL();
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, CNPJ);
			
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


