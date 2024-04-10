using System.Text.Json;

namespace file_handling_api
{
    public class files
    {
        public void copy(string src_path,string dst_path,string dst_name)
        {
            /* Src */
            FileInfo src_file = new FileInfo(src_path);
            /* Dst */
            FileInfo dst_file = new FileInfo(dst_path+"\\"+dst_name);

            /* Read src_file */
            FileStream src_file_stream = src_file.Open(FileMode.Open);
            /* Get the size/length of src_file */
            int length = (int)src_file_stream.Length;
            /* Create Data Byte/s Storage */
            byte[] src_data = new byte[length];
            /* Read and Store the Bytes */
            for (int index = 0; index < length; index++)
            {
                src_data[index] = (byte)src_file_stream.ReadByte();
            }
            /* Close src_file_stream */
            src_file_stream.Close();

            /* Create dst_file */
            FileStream dst_file_stream = dst_file.Open(FileMode.OpenOrCreate);
            /* Write Data Byte/s to dst_file */
            dst_file_stream.Write(src_data, 0, src_data.Length);
            /* Close dst_file_stream */
            dst_file_stream.Close() ;
        }
        public void move(string src_path, string dst_path, string dst_name)
        {
            /* Src */
            FileInfo src_file = new FileInfo(src_path);
            /* Dst */
            FileInfo dst_file = new FileInfo(dst_path + "\\" + dst_name);

            /* Read src_file */
            FileStream src_file_stream = src_file.Open(FileMode.Open);
            /* Get the size/length of src_file */
            int length = (int)src_file_stream.Length;
            /* Create Data Byte/s Storage */
            byte[] src_data = new byte[length];
            /* Read and Store the Bytes */
            for (int index = 0; index < length; index++)
            {
                src_data[index] = (byte)src_file_stream.ReadByte();
            }
            /* Close src_file_stream */
            src_file_stream.Close();

            /* Create dst_file */
            FileStream dst_file_stream = dst_file.Open(FileMode.OpenOrCreate);
            /* Write Data Byte/s to dst_file */
            dst_file_stream.Write(src_data, 0, src_data.Length);
            /* Close dst_file_stream */
            dst_file_stream.Close();

            /* Delete src_file */
            src_file.Delete();
        }
    }
}