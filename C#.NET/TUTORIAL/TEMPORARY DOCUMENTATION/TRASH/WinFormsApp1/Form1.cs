namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

        }

        private void listView1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String[] row = { "vistio", "vist", "awd" };
            ListViewItem listViewItem = new ListViewItem(new string[] { textBox1.Text, textBox2.Text, textBox3.Text }, -1);
            listView1.Items.AddRange(new ListViewItem[] { listViewItem });
        }

        private void listView1_MouseClick(object sender, MouseEventArgs e)
        {
            String first = listView1.SelectedItems[0].SubItems[0].Text;
            String second = listView1.SelectedItems[0].SubItems[1].Text;
            String third = listView1.SelectedItems[0].SubItems[2].Text;

            if (first.Equals(""))
            {
                first = "0";
            }

            if (second.Equals(""))
            {
                second = "0";
            }

            if (third.Equals(""))
            {
                third = "0";
            }
            textBox1.Text = first;
            textBox2.Text = second;
            textBox3.Text = third;
        }
    }
}