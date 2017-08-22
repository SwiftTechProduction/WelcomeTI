/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Lukas
 */
@Named(value = "studentBean")
@Dependent
public class StudentBean 
{
    private String nama;
    private String no_telepon;
    private String alamat;
    private String jurusan;
    private String motto_hidup;
    
    /**
     * Creates a new instance of StudentBean
     */
    public StudentBean() 
    {
        
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getNo_telepon() 
    {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) 
    {
        this.no_telepon = no_telepon;
    }

    public String getAlamat() 
    {
        return alamat;
    }

    public void setAlamat(String alamat) 
    {
        this.alamat = alamat;
    }

    public String getJurusan() 
    {
        return jurusan;
    }

    public void setJurusan(String jurusan) 
    {
        this.jurusan = jurusan;
    }

    public String getMotto_hidup() 
    {
        return motto_hidup;
    }

    public void setMotto_hidup(String motto_hidup) 
    {
        this.motto_hidup = motto_hidup;
    }
    
    public String selectPage() 
    {
        if (jurusan.equalsIgnoreCase("Teknik Informatika")) 
        {
            return "welcome";
        }
        if (jurusan.equalsIgnoreCase("")) 
        {
            return "lain";
        } 
        else 
        {
            return "other";
        }
    }
    
}
