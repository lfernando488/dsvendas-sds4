import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/footer/footer";
import Navbar from "components/navbar";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary py-3"> Dashboard de vendas </h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5>Taxa de sucesso</h5>
            <BarChart/>
          </div>
          <div className="col-sm-6">
            <h5>Total de vendas</h5>
            <DonutChart/>
          </div>
        </div>

        <div className="pt-3">
          <h2 className="text-primary"> Total vendas </h2>
        </div>

        <DataTable/>
      </div>
      <Footer/>
    </>
  );
}

export default App;
