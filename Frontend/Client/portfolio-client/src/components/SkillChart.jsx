import { Bar } from "react-chartjs-2";
import {
  Chart as ChartJS,
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend
} from "chart.js";

ChartJS.register(
  BarElement,
  CategoryScale,
  LinearScale,
  Tooltip,
  Legend
);

function SkillChart({ skills }) {
  const data = {
    labels: skills.map(s => s.name),
    datasets: [
      {
        label: "Skill Level",
        data: skills.map(s => s.proficiency),
        backgroundColor: "var(--primary-color)"
      }
    ]
  };

  return <Bar data={data} />;
}

export default SkillChart;
